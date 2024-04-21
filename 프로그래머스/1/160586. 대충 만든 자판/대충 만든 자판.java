import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
       // String target 에 맞는 누른 횟수를 반환할 배열 필요
       int[] answer = new int[targets.length];

       // Todo:
        //  1. 주어진 키맵의 요소를 모두 사용해서 가장 적게 눌러서 target 만들기
        //  2. 가장 적게 누른 수를 answer에 저장

        // 1번 키패드에서는 B를 2번 누르면 입력되지만, 2번 키패드에서는 B를 1번 누르면 입력되는 경우
        // target 문자열 중 문자 B 를 입력해야한다면 2번 키패드의 B를 사용하는 것이 최소값을 구할 수 있다
        // 해당 문자를 키로 가지고, 최소값을 값으로 가지는 맵 생성하기
        // anser[i] 에 담을 변수 필요
        // keymap 순회하며 새로운 문자 등장하면 키로 등록, 해당 위치에 +1 해서 값으로 매핑
        // 두 개의 데이터를 저장해야돼서 맵 사용: 주어진 키맵으로 가장 효율적인 키패드 1개 생성
        Map<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                if (keypad.containsKey(ch)) {
                    int value = keypad.get(ch);
                    keypad.put(ch, Math.min(value, j + 1));
                } else {
                    keypad.put(ch, j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            for (char ch : target.toCharArray()) {
                if (keypad.containsKey(ch)) {
                    answer[i] += keypad.get(ch);
                } else {
                    answer[i] = -1;
                    // 현재 ch, 즉 문자 한 개라도 키패드에 없다면 나머지 문자 검색하지 않는다
                    break;
                }
            }
        }

        return answer;

    }
}
  