class Solution {
    public int[] solution(long n) {
        // 숫자 -> 문자열 변환
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        // 문자열을 뒤에서부터 하나씩 숫자로 파싱하기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(s.substring(s.length()-1-i, s.length()-i));
        }
        
        return answer;
    }
}