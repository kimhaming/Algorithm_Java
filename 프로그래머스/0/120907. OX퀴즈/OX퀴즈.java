import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).
                map(i -> {
            String[] str = i.split(" ");
            int first = Integer.parseInt(str[0]);
            int second = Integer.parseInt(str[2]);
            int third = Integer.parseInt(str[4]);

            boolean isCorrect = str[1].equals("+") ?
                    first + second == third :
                    first - second == third;

            if (isCorrect) {
                return "O";
            } else {
                return "X";
            }
        }).toArray(String[]::new);
    }
}