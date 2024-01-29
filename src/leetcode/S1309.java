package leetcode;

import java.util.Arrays;

public class S1309 {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        // 출력: "jkab"
        // 설명: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2"
    }
    public static String freqAlphabets(String s) {
        // 1 ~ 9 => a ~ i
        // 10# ~ 26# => j ~ z
        // 뒤에서부터 앞으로 탐색하여 #이 안나타난 인덱스의 숫자는 바로 해당 알파벳으로 replace
        // #이 나타난 인덱스는 해당 인덱스 포함하여 앞앞자리의 인덱스까지 포함하여 해당 알파벳으로 replace
        // ex) 2 -> b, 1 -> a, 11# -> k, 10# -> j
        // 아스키코드표의 s.charAt(i) 에 해당하는 숫자를 알파벳 소문자로 변경해주려면 +96 해준다.

        String replaced_s = "";
        char replaced_c;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '#') {
                // 해당 숫자를 알파벳으로 변경 replace()
                replaced_c = (char) (s.charAt(i) + 96);
            } else {
                // 해당 #부터 -2 인덱스까지 포함한 뭉탱이를 알파벳으로 변경 replace()
                replaced_c = (char) (Integer.parseInt(s.substring(i - 2, i) + 96));
                i = i - 2;
            }
            replaced_s = replaced_s + replaced_c;
        }

        return replaced_s;
    }
}
