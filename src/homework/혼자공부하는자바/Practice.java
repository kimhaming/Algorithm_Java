package homework.혼자공부하는자바;

import java.io.IOException;

public class Practice {
    public static void main(String[] args) throws IOException {
        /**
         *          자동 타입 변환
         *          작은 것 -> 큰 것 (o)
         *          큰 것 -> 작은 것 (x)
         */

        // byte -> int
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        //  char -> int
        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        //  int -> long
        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        //  long -> float
        longValue = 100;
        float floatValue = longValue;
        int intValue2 = (int) longValue;
        System.out.println("floatValue: " + intValue2);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);

        int intValue3 =65;
        char charValue3 = (char) intValue3;
        System.out.println(charValue3); // 65의 유니코드는 문자 A

        String str2 = "8" + 10 + 2;
        System.out.println(str2);

        String str = "300000";
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            System.out.print(value);
        }
//        String str4 = "1";
        int value = Integer.parseInt("123");
        System.out.println(value);

        byte byteValue1 = 10;
        char charValue1 = 'A';
        float floatValue1 = 2.5F;
        double doubleValue1 = 2.5;

//        byte result = byteValue1 + byteValue1;  // 컴파일 에러
        int result = byteValue1 + byteValue1; // (o)

        char c1 = 'a';
        char c2 = (char) (c1 + 1);
        System.out.println(c2);

        int x = 5;
        int y = 2;
        double result1 = (double)x / y;
        System.out.println(result1);

        double var1 = 3.5;
        double var2 = 2.7;
        double result2 = var1 + var2;
        System.out.println(result2);

        int a = 10;
        int b = 20;
        int z = (++a) + (b--);
        System.out.println(z);

        Week today = Week.MONDAY;
        Week week1 = Week.TUESDAY;
        Week week2 = Week.TUESDAY;
        System.out.println(week1 == week2);
    }
}
