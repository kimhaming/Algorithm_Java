package homework.혼자공부하는자바.sec04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputData;

        while(true) {
            inputData = sc.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }

        System.out.println("종료");
    }
}
/**
 * 기보 타입의 값이 동일한지 비교할 때에는 == 으로 비교하고,
 * 문자열 비교는 .equals
 */

