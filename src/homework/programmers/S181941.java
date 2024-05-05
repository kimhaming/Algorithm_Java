package homework.programmers;

public class S181941 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181941
    public static void main(String[] args) {
        String[] arr = {"h", "a", "m", "i", "n"};
        System.out.println(solution(arr));
    }

    /**
     * for (원소 0부터 arr.length-1 까지)
     * 새로운 String 변수 += ;
     * return 변수;
     */
    public static String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
