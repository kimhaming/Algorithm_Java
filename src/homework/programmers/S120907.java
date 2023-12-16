package homework.programmers;

import java.util.Arrays;

public class S120907 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }
    // 연산이 참인지 거짓인지 판별하여 저장되는 새로운 문자열 배열 생성 -> String[] answer
    // 배열 quiz를 돌면서 boolean에 담아보기
    // String 배열의 원소 하나씩 boolean 변수에 담아서 true, false 판별할 수 있나? (X 다른 방법 찾기)

    public static String[] solution(String[] quiz) {
        // 주어진 연산에 대응하는 O/X를 저장할 새로운 배열 answer 생성하기
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            // 연산식 문자열을 공백 기준으로 나누어 피연산자, 연산자를 새로운 배열에 저장하기
            String str = quiz[i];
            String[] arr = str.split(" ");

            // 먼저 숫자 x,y,x는 배열의 0,2,4번째이므로 문자열 -> 숫자로 바꿔주는 매퍼클래스 사용하여 저장하기
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);
            int z = Integer.parseInt(arr[4]);
            // 연산자는 배열의 1번째이므로 변수에 저장하기 (3번째인 = 는 필요없음)
            String operator = arr[1];

            int result = 0;
            if (operator.equals("+")) {
                result = x + y;
            }
            else {
                result = x - y;
            }
            if (result == z) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}
