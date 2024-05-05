package homework.programmers;

public class S133499 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/133499

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        solution(babbling);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (babbling[i].contains(arr[j])) {
                    babbling[i] = babbling[i].replaceFirst(arr[j], "");
                }
            }
            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
