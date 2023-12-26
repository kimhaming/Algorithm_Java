package homework.혼자공부하는자바;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalcu = new Calculator();
        double result1 = myCalcu.areRectangle(10);
        double result2 = myCalcu.areRectagle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
