package leetcode;

public class S1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    // Todo: 주어지는 숫자에서부터 0이 될 때까지 총 몇 단계를 거치는지 count를 세어 반환하는 함수 만들기
    /**
     *     처음에 for문을 사용했더니 증감식으로 인해 단계를 거치며 만들어지던 순간마다의 현재 숫자가
     *     제어되지 않고 반본묵의 증감식에 의해 다시 증가되는 문제가 발생하여
     *     while문으로 0보다 큰 동안 이라는 조건식만 부여하기로 한다.
     */
    public static int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            // 짝수인 경우든 홀수인 경우이든 어떤 조건식을 거치든 간에 부합하는 규칙의 식을 거쳐서 num이 감소되도록 식을 세운 후, count++

            // 현재 num 이 짝수일 때,
            if (num % 2 == 0) {
                num = num / 2;
                count++;

                // 현재 num 이 홀수일 때,
            } else {
                num = num - 1;
                count++;
            }
        }

        return count;
    }
}
