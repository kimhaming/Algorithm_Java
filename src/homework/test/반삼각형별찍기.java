package homework.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 반삼각형별찍기 {
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
 * 1행일 때 (i = 0일 때) 별 1개
 * 2행일 때 (i = 1일 때) 별 2개
 * 3행일 때 (i = 2일 때) 별 3개 (바깥 for문 한 개 돌 때, 중첩 for문에서 반복될 횟수 => 열의 갯수)
 *
 * 처음 출력 때 i와 j를 0으로 초기화해서 i=0일 때(1행) 별이 j=0 개 출력되어 기대와 다르게 나왔다.
 */
