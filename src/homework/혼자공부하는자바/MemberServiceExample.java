package homework.혼자공부하는자바;

public class MemberServiceExample {
   public static void main(String[] args) {
       MemberService memberService = new MemberService();

       boolean result = memberService.login("hong", "12345");

       if(result) {
           System.out.println("로그인 되었습니다.");
           memberService.logout("hong");
       } else {
           System.out.println("id와 password가 일치하지 않습니다.");
       }
   }
}
