package homework.test;

public class 정사각형별찍기 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
        /**
         * 별이 한 줄에 5개 출력될 때마다 줄바꿈이 5번 반복
         * *****    -> print로 5번 반복 출력 후에 줄바꿈 1번
         * *****
         * *****
         * *****
         * *****
         */
