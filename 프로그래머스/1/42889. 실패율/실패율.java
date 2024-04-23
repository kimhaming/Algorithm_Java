import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        // key = 스테이지 번호, value = 실패율
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            double failNum = 0;
            double challengeNum = 0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    failNum++;
                }
                if (stages[j] >= i) {
                    challengeNum++;
                }
            }
            double failRate = (challengeNum != 0) ? failNum / challengeNum : 0;
            map.put(i, failRate);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1,o2)-> map.get(o2).compareTo(map.get(o1)));//value값으로 내림차순 정렬

        for (int i=0;i<N;i++) {
            answer[i] = keySet.get(i); //키값 즉 스테이지 번호를 담아줌
        }
        return answer;
    }
}