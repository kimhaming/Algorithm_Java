class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;

        // 요소의 개수 num이 짝수일 때
        if (num % 2 == 0) {
            start = (total/num) - (num/2 - 1);
        } else { // 요소의 개수 num이 홀수일 때
            start = (total/num) - (num/2);
        }

        for (int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }
        return answer;
    }
}