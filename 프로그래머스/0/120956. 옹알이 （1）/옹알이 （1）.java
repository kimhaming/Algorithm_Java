import java.util.regex.Pattern;

class Solution {
    
        private static final String[] PATTERNS = {"aya", "ye", "woo", "ma"};   // final 상수 배열 생성
    public int solution(String[] babbling) {
        return (int) java.util.Arrays.stream(babbling)
                .filter(Solution::isValidBabbling)   //  .filter(클래스명::메서드명)
                .count();
    }

    // babbling 배열에 있는 각 문자열 요소를 매개변수 String word로 본다.
    // isValidBabbling() 메서드: 각 문자열이 유효한지 검사하는 메서드
    private static boolean isValidBabbling(String word) {
        String pattern = String.join("|", PATTERNS);
        String replacedWord = word.replaceAll(pattern, "");
        return replacedWord.isEmpty() && Pattern.matches("((" + pattern + ")+)", word);
    }
}