package homework.혼자공부하는자바;

public class Exam05 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                count++;    // 평균 avg 구하기 위해 필요한 변수 -> 반복문 돈 횟수 = 더한 점수의 총 개수
            }
        }
        avg = (double) sum / count;

        System.out.println(sum);
        System.out.println(avg);
    }
}
