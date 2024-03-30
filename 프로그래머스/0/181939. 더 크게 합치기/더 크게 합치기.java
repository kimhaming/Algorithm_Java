class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = "";
        String reverse_sum = "";

        sum = Integer.toString(a);
        sum += Integer.toString(b);

        reverse_sum = Integer.toString(b);
        reverse_sum += Integer.toString(a);

        if (Integer.parseInt(sum) > Integer.parseInt(reverse_sum)) {
            answer = Integer.parseInt(sum);
        } else answer = Integer.parseInt(reverse_sum);

        return answer;
    }
}