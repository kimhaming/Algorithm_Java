class Solution {
    public String solution(String s, String skip, int index) {
        /**
         * 1. s를 순회하며 현재 문자를 지정하고, 이중 for문으로 index만큼 ch를 이동시킨다.
         * 2. ch = ch + 1, 2, 3, 4, 5 일 때, 해당 문자가 skip에 포함되지 않으면 현재 문자가 된다.
         * 3. 포함된다면, 그만큼 한 번 더 순회해야하므로 현재 순회 번호를 -1 시키고, 다음 순회로 넘어간다.
         * 4. 현재 문자 ch가 'z' 보다 큰 숫자가 된다면, 다시 'a'로 변환해줘야한다.
         * a(97) ~ z(122)
         */
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); // a -> u -> k -> k -> s
            for (int j = 1; j <= index; j++) {  // 1,2,3,4,5 다섯번 순회
                currentChar += 1;   // 1 더한 b부터 검사 시작
                // 아스키코드 기반으로 문자 z를 넘어서서 123 ~ 127 에 해당하는 알파벳이 아닌 문자가 될 경우
                if (currentChar > 122) {
                    currentChar -= 26;
                }
                // skip의 길이가 index 길이와 같다는 조건이 없어서 잘못된 코드
//                if (currentChar == skip.charAt(j))
                // skip 문자열에 currentChar 문자열이 포함되어 있는지 검사
                    if (skip.contains(String.valueOf(currentChar))) {
                        // 포함되어있다면 한 번 더 검사해야되기 때문에 j에 1 빼주기
                        j -= 1;
                    }
            }
            // 특정 문자에 대한 대체 문자가 저장되어 나온 currentChar 를 결과 문자열 변수에 담기
            answer += currentChar;
        }

        return answer;
    }
}