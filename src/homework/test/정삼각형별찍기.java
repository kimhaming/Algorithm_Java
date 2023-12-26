package homework.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정삼각형별찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/**
 * n이 증가함에 따라 행이 비례 증가하므로 바깥 for문 필요
 * n이 증가함에 따라 열이 2씩 증가하므로 2의 배수 활용하여 중첩 for문 필요
 * n이 증가함에 따라 첫 출력에 공백 수가 증가하므로 먼저 일어날 실행은 공백이어야 함
 */
