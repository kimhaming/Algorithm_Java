package homework.programmers;

public class S120866 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(board));
    }
    /**
     * Todo:
     *  1. (2,2) (2행 2열) 에 지뢰가 있다면 board 배열에 1이 찍힌다.
     *  2. 인접된 행렬들은 위험한 지역으로 여긴다.
     *  3. 총 칸 수 - 1 - 위험한 지역 수 = 안전한 지역 수
     */

    public static int solution(int[][] board) {
        int answer = 0;
        return answer;
    }
}
