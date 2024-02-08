package leetcode;

public class S0383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baabab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        // magazine에 있는 문자로 ransomNote 문자열을 구성할 수 있다면 true
        // magazine.length < ransomNote.length 라면, magazine 의 각 문자들이 모두
        // ransomNote에 포함되더라도 ransomNote가 완성되지 않기 때문에 false 이다.
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        // 이제는 무조건 magazine.length >= ransomNote.length
        // 그러한 조건은 걸러냈으니 이제 문제에 집중할 수 있다.
        // ransomNote.charAt(i) 순회하여 magazine 에 포함되는지 확인하기
        for (char c : ransomNote.toCharArray()) {
            // indexOf() 메서드에 매개변수로 문자 담아주면, 해당 문자의 위치를 반환해준다.
            int index = magazine.indexOf(c);

            // 해당 위치가 -1 이라면 원하는 문자 c가 magazine에 없는 것
            if (index == -1) {
                return false;
            }

            // 다음 문자 c를 순회하러 가기 전에 찾은 c를 magazine 에서 제거해줘야 중복 탐색 방지할 수 있다.
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }

        // 원하는 c가 for문 중간에 종료되지 않고 모든 테스트를 성공적으로 수행했다면,
        // for문을 빠져나온후 테스트 통과의 의미로 true 반환하여 함수를 마무리 짓는다.
        return true;
    }
}
