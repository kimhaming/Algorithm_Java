class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'p' || c == 'P') {
                pNum++;
            } else if (c == 'y' || c == 'Y') {
                yNum++;
            }
        }

        if (pNum == yNum) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}