package homework.연습장;

public class Calculator {
    public static int num1 = 5; // 클래스 변수 = 전역 변수 = 모든 인스턴스에서 같은 값을 유지
    public int num2 = 10;   // 인스턴스 변수 =

    public static void Add(int i) {
        int stackValue = 0; // 지역 변수
//        Calculator calculator = new Calculator();
//        int num = calculator.num2;
        System.out.println("This is a add() function!" + num1 + stackValue);
    }
}
