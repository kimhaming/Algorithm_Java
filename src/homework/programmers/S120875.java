package homework.programmers;

public class S120875 {
    // Todo:
    //  1. 배열 dots 길이는 4로 고정
    //  2. 평행이라면, |y1 + y2| == |y3 + y4|, |x1 + x2| == |x3 + x4|
    //  3.
    public static void main(String[] args) {

        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        // 점선을 나타내는 dots[][].length == 4
        // dots[i].length == 2
        // x3 - x1 == x4 - x2,  y3 - y1 == y4 - y2

        int x = 0;
        int y = 0;

        for (int i = 0; i < 4; i++) {
            dots[i][0] - dots[i]; {
                for (int k = 0; k < 2; k++) {

                }
                }
        }
        }
        }
/**        if (평행이 되는 경우 && 두 직선이 겹치는 경우) {
            return 1;
        } else {
            return 0;
        }
    }
}
