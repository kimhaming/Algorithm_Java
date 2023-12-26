package homework.혼자공부하는자바;

public class Singleton {
    // 정적 필드
    private static Singleton singleton = new Singleton();   // 접근제한자 정적static 클래스 객체 = new 클래스();
    // private: 클래스 내부에서만 접근 가능
    // static: 클래스의 인스턴스와는 독립적으로 사용되며 클래스 레벨에 속하고, 객체 생성 없이도 사용 가능
    // Singleton: 필드의 타입
    // singleton: 필드의 이름
    // = new Singleton();: 필드를 초기화하는 부분으로, 클래스의 새로운 인스턴스를 생성하여 할당

    // 생성자
    // private 으로 선언하면 외부에서 호출할 수 없도록 됩니다.
    private Singleton() {}

    // 정적 메서드
    // getInstance() 메서드를 통해서만 객체 하나를 호출할 수 있다.
    static Singleton getInstance() {
        return singleton;   // 유일한 객체 하나를 리턴해준다.
    }
}
