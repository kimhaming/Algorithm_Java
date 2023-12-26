package homework.혼자공부하는자바;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;    // 아직 배열 객체가 생성되지 않은 상태 -> 크기를 부여하여 초기화해줘야한다.

        Scanner sc = new Scanner(System.in);

        while(run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택> ");

            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = sc.nextInt();
            }
            else if (selectNo == 2) {
                scores = new int[3];
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores["+i+"]> ");
                    scores[i] = sc.nextInt();
                }
            }
            else if (selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores["+i+"]> " + scores[i]);
                }
            }
            else if (selectNo == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0.0;
//                int count = 0;

                for (int i = 0; i < scores.length; i++) {
                    max = Math.max(max, scores[i]);
                    sum += scores[i];
//                    count++;
                }
                avg = (double) sum / studentNum;

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);

            } else if (selectNo == 5){
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }
}
