package homework.programmers;
public class P120956 {

    //  Todo:
    //   1. 문자열을 요소로 가진 크기 15 이하의 배열
    //   2. 중복 사용 불가 -> 중복 체크하기
    //   3. 조합하여 나올 수 있는 단어의 개수 구하기
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling));
    }
    public static int solution(String[] babbling) {
        int result = 0;

        String[] str = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < babbling.length; j++) {
                if (babbling[j].contains(str[i])) {
                    result++;
                }
            }
        }
        return result;
    }
}
/**
 * 오류: 1이 출력되어야 하는데 4가 출력된다.
 *  3이 출력되어야 하는데 8이 출력된다.
 */
