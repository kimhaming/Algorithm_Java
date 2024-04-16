class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        // quiz 요소 순회하면서 문자열을 뜯어서 실제 연산 확인하기
        // 첫번째 순회할 때 숫자와 부호 독립적으로 뽑아내서 정답인지 체크하고 결과를 result에 저장하는 것까지 해야된다
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int firstNum = Integer.parseInt(str[0]);
            int secondNum = Integer.parseInt(str[2]);
            int thirdNum = Integer.parseInt(str[4]);
            String operator = str[1];

            boolean isCorrect = operator.equals("+") ?
                    firstNum + secondNum == thirdNum :
                    firstNum - secondNum == thirdNum;

            if (isCorrect) {
                answer[i] = "O";
            }
            else answer[i] = "X";
            }

        return answer;
    }
}