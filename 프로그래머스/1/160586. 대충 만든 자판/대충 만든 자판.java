import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
       int[] answer = new int[targets.length];
        // 두 개의 데이터를 저장해야돼서 맵 사용: 주어진 키맵으로 가장 효율적인 키패드 1개 생성
        Map<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                if (keypad.containsKey(ch)) {
                    int value = keypad.get(ch);
                    keypad.put(ch, Math.min(value, j + 1));
                }
                else {
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
                    break;
                }
            }
        }

        return answer;
    }
}