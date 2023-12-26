package homework.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 반삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/**
 * *
 * **
 * ***
 * ****
 * *****   n = 5 일 때
 * 바깥 for문이 한 번 돌 때 중첩 for문 내부도 한 번만 돌아야하고,
 * 두 번 돌 때도 마찬가지로, 중첩 for문에서는 두 개가 찍혀야한다.
 * 중첩 for문의 범위가 바깥 for문의 범위에 따라 증가한다. j 범위가 i에 따라 증가한다. j와 i가 비례
 * 하지만, 주의할 점은 초기화는 0부터 가능하기 때문에 j=0 으로 초기화할거면 i=1로 초기화하여
 * 중첩for문의 범위를 j < i 로 해야 첫문장 때부터 별 1개를 찍을 수 있다.
 * 또는,
 * i,j 모두 0으로 초기화할거라면, 중첩 for문에서의 j 범위를 j <= i 으로 해야 한다.
 */
