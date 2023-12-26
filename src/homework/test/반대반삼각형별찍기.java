package homework.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 반대반삼각형별찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 * 입력받은 n -> *이 찍힐 행(줄)의 수와 마지막 줄의 별의 개수가 된다.
 * 1행: 공백 4 + 별 1
 * 2행: 공백 3 + 별 2
 * 5행: 공백 0 + 별 5
 *
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * i = 1일 때, 공백 4개 + 별 1개
 * i = 2, 공백 3개 + 별 2개
 * i = 3, 공백 2개 + 별 3개
 * i = 4, 공백 1개 + 별 4개
 * i = 5, 공백 0개 + 별 5개
 */
