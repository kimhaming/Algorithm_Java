class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) {
            sum += i;
        }
        
        return sum;
    }
}