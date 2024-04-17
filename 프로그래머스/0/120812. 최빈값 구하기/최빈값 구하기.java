import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        Map<Integer, Long> map = Arrays.stream(array)
                .boxed()    // int를 Map의 key 타입으로 boxing
                // {0=1, 1=1, 2=2, 4=1, 5=1, 10=3} 으로 map에 저장된다
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // 최빈값 찾기
        // Map.Entry: Map의 키와 값 쌍을 하나의 객체로 얻을 수 있다
        Optional<Map.Entry<Integer, Long>> mostFrequency = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()); // 객체에는 3이 담긴다.

        long maxFrequency = mostFrequency.map(Map.Entry::getValue).orElse(-1L);

        // 여기서 for문처럼 map의 값을 모두 스트림으로 변환해서 val 인자에 담아서 maxFrequency와 같은 val에 해당하는 값을 찾고, 찾은 수의 개수를 세어 count에 담는다
        long count = map.values().stream().filter(val -> val == maxFrequency).count();

        return count == 1 ? mostFrequency.get().getKey() : -1;
    }
}