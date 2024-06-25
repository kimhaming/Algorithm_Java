class Solution {
    public int solution(long num) {
        int answer = 0;
        if (num == 1) return 0;

        for (int i = 1; i <= 500; i++) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

            if (num == 1) {
                answer = i;
                break;
            }
        }

        if (num != 1) {
            return -1;
        }

        return answer;
    }
}