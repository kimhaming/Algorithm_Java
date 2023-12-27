package homework.programmers;

public class S120876 {
    //  Todo:
    //   1. 겹쳐있는 선분 판별하기 -> 겹치는 부분 찾을 수 있는 기능 함수 만들기
    //   2. [a1, b1], [a2, b2], [a3, b3]
    //   3. y축 값은 없다. a,b 모두 x축 선상에 있음.
    //   4. 새로운 배열에 저장해서 인덱스로 불렀을 때 값이 2 이상이면 겹치는 것
    //   5. 음수는 배열에서 어떻게 표현? -> 인덱스는 0부터 시작할 수 있기 때문에 범위를 변경한다. 0 ~ 200
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        System.out.println();
    }

    public static int solution(int[][] lines) {

        int answer = 0; // 겹친 부분 수
        int[] arr = new int[200];    // 인덱스 호출했을 때 2이상 저장되어있는 개수 확인할 배열

        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length; j++) {
                // 어떻게 뽑아서 arr에 담아야 할까?
            }
        }
        return answer;
    }

    // 겹치는 부분 찾기 함수
    private static boolean findOverlapping(int[][] lines) {
        return ;
    }
}
