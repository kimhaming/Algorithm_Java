package homework.혼자공부하는자바;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();  // 객체 생성
        myCar.keyTurnOn();  // 메서드 실행
        myCar.run();    // 메서드 실행
        int speed = myCar.getSpeed();   // 리턴타입이 있는 메서드는 가져와서 같은 타입의 변수에 담을 수 있다.
        System.out.println("현재 속도: " + speed + "km/h");
    }
}
