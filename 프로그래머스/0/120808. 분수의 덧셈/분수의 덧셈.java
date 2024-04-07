class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int max = 0;
        int numer3 = (numer1 * denom2) + (numer2 * denom1);
        int denom3 = denom1 * denom2;
        
        int[] answer = new int[2];
        // numer3와 denom3의 최대공약수 찾기
        
        for (int i = 1; i <= numer3 && i <= denom3; i++) {
            if (numer3 % i == 0 && denom3 % i == 0) {
                max = i;
            }
        }
        if (max != 0) {
            answer[0] = numer3 / max;
            answer[1] = denom3 / max;
        }
        else {
            answer[0] = numer3;
            answer[1] = denom3;
        }

        return answer;
    }
}