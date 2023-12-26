package homework.혼자공부하는자바;

public class Computer {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {1, 2, 3};  // int형 배열 선언 및 저장
        int result1 = myCom.sum1(values1);
        System.out.println(result1);

        int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
        System.out.println(result2);

        int result3 = myCom.sum2(1, 2, 3, 4, 5);
        System.out.println(result3);

        int result4 = myCom.sum2(1, 2, 3);
        System.out.println(result4);
    }
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}
