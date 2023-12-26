package homework.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 반대반삼각형2 {
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
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * i = 1, 공백 4 + 별 1
 * i = 5, 공백 0 + 별 5
 */
