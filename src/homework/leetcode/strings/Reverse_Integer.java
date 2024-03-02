package homework.leetcode.strings;

public class Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            // 숫자의 마지막 자릿수를 저장
            int pop = x % 10;
            // 마지막 자릿수를 제외한 나머지 숫자 저장
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            // 현재 결과에 새로운 자릿수 추가
            rev = rev * 10 + pop;
        }

        return rev;
    }
}
