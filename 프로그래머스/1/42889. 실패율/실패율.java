import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
       // 각 스테이지의 실패율을 반환할 배열 생성
        double[] answer = new double[N];

        // stages 배열의 요소를 키로 저장, 키에 해당하는 숫자가 등장하는 횟수를 값으로 매핑
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < stages.length; i++) {
            int value = 0;

            if (map.containsKey(stages[i])) {
                value += 1;
                map.put(stages[i], value);
            } else {
                map.put(stages[i], 0);
            }
        }
        // map에는 스테이지 현재 단계를 키, 해당 단계에서 실패한 사람 수를 값으로 매핑되어있다
        // 실패율은 실패한 사람 수 / 도전한 사람 수
        for (int i = 0; i < answer.length; i++) {
            int challengers = N;
            answer[i] = map.get(i) / challengers;
            challengers -= map.get(i);
        }

        Integer[] index = new Integer[answer.length];

        for (int i = 0; i < answer.length; i++) {
            index[i] = i + 1;
        }

        Arrays.sort(index, Comparator.comparingDouble(i -> answer[i]).reversed());

        return Arrays.stream(index).mapToInt(Integer::intValue).toArray();
}