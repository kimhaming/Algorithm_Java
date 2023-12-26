package homework.혼자공부하는자바.sec05;

public class StringEqualsExample {
    public static void main(String[] args) {
        // 문자열 리터럴로 생성한다면, 같은 주솟값 참조
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        boolean what = strVar1.equals(strVar2);
        System.out.println(what);

        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if (strVar3 == strVar4) {
            System.out.println("참조가 같음");
        } else {
            System.out.println("참조가 다름");
        }

    }
}
