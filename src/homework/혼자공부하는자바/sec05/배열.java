package homework.혼자공부하는자바.sec05;

import java.util.Arrays;

public class 배열 {
    public static void main(String[] args) {

        int sum2 = add( new int[] {83, 90, 97});
        System.out.println(sum2);

        int sum = 0;
        int[] scores = {80, 75, 70};

        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        double evg = sum / 3;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + evg);

        String[] names = null;
        names = new String[] {"신용권", "홍길동", "감자바"};

        int[] scores2 = new int[] {100, 20, 97};
        System.out.println(Arrays.toString(scores2));
    }


    public static int add(int[] score) {
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += score[i];
        }
        return sum1;
    }
}
