package homework.혼자공부하는자바.sec05;

public class exam01 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        System.out.println(scores[0]);

        // 총합
        // 평균
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println(sum);

        double avg = (double) sum / scores.length;
        System.out.println(avg);

        int[][] sc = new int[2][];
        sc[0] = new int[2];
        sc[1] = new int[3];
    }
}
