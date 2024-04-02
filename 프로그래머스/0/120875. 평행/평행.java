class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];

        // 2개의 기울기가 같은지 확인하기 위해 기울기 변수 2개 만들기
        double slope1 = (double) (y1 - y2) / (x1 - x2);
        double slope2 = (double) (y3 - y4) / (x3 - x4);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y3 - y1) / (x3 - x1);
        slope2 = (double) (y4 -y2) / (x4 - x2);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y4 -y1) / (x4 - x1);
        slope2 = (double) (y3 - y2) / (x3 - x2);
        if (slope1 == slope2) answer = 1;

        return answer;
    }
}