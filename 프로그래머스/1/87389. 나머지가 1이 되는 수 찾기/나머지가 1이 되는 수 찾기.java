class Solution {
    public int solution(int n) {
        int x = 0;
        // n을 몇으로 나누었을 때 나머지가 1이 되는지 찾기
        // 1로 나누면 n이 몇이든 나머지는 없기 때문에 1 제외하고 2부터 용의자
        // n을 n만큼 나누면 그것도 나머지는 없기 때문에 n 미만까지
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                x = i;
                break;
            }
        }
        return x;
    }
}