class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        if (slopeCalculator(dots[0], dots[1]) == slopeCalculator(dots[2], dots[3]))
            return 1;

        if (slopeCalculator(dots[0], dots[2]) == slopeCalculator(dots[1], dots[3]))
            return 1;

        if (slopeCalculator(dots[0], dots[3]) == slopeCalculator(dots[1], dots[2]))
            return 1;

        return answer;
    }

    // 기울기 구하기 메소드 만들기
    public static double slopeCalculator(int[] dot1, int[] dot2) {
        double slope = 0;

        slope = (double) (dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);

        return slope;
    }
}