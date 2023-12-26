package homework.혼자공부하는자바.sec04;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += 2;
            // sum이 10, 20, 30 ...이 될 때마다 10의 배수임을 알려주기
        }
        if (sum % 10 == 0) {
            System.out.println("10의 배수입니다.");
        }
        else {
            System.out.println(sum);
        }
    }
}
