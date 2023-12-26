package homework.혼자공부하는자바;

public class ShopServiceExample {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();   // return shopService;
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("같은 객체가 아닙니다.");
        }

//        int[] intArray = null;
//        intArray[0] = 10;
//
//        String str = null;
//        System.out.println(str.length());   // 실행시 nullpointerExeption 뜬다.

        String str1 = "rr";
        String str2 = "rr";

        String str3 = new String("gg");
        String str4 = new String("gg");

        if (str3 == str4) {
            System.out.println("gg");
        } else {
            System.out.println("!!");
        }

        if (str1 == str2) {
            System.out.println("같은 객체 참조");
        } else {
            System.out.println("다른 객체 참조");
        }
    }
}
