package homework.leetcode;

public class S1672 {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    // return answer = 6
    // 각 배열 내부의 합 중에 가장 큰 합 return
    public static int maximumWealth(int[][] accounts) {
        int answer = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                answer =  Math.max(answer, sum);
            }
        }

        return answer;
    }
}
