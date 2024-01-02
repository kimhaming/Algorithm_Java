package homework.programmers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S120876 {
    //  Todo: HashSet 이용하기

    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};

        System.out.println(solution(lines));
    }

    public static int solution(int[][] lines) {
        Set<Integer> positions = new HashSet<>();

        // 2차원 배열의 요소를 1차원 배열 변수 line에 담아서 하나씩 실행 반복
        for (int[] line : lines) {
            // 1차원 배열 line의 첫번째 요소 (start 좌표)에 +100 하여 초기화, 두번째 요소 (end 좌표) +100 미만까지 반복해야
            // 해당 좌표를 마지막으로 지나는 선분의 인덱스 범위가 된다.
            for (int j = line[0] + 100; j < line[1] + 100; j++) {
               // 해당 위치에 대한 숫자를 중복없이 저장한다.
                positions.add(j);
            }
        }

        // 해당 위치에 대한 숫자를 저장한 set에 담긴 숫자 pos를 하나씩 돌면서
        int intersections = 0;
        for (int pos : positions) {
            int count = 0;
            for (int[] line : lines) {
                // 현재 돌고 있는 1차원 배열의 첫번째 요소 (시작점) +100 이상 두번째 요소 (끝점) 미만 범위에
                // pos가 포함된다면
                // count++ 하고나면, 다시 다음 일차원 배열을 순회해서 현재 if문이 참이라면 또 count++ 한다.
                if (line[0] + 100 <= pos && pos < line[1] + 100) {
                    // count를 증가시킨다.
                    count++;
                }
            }
            // 특정 pos일 때에 count가 1 초과라면, 해당 선분 자리에(인덱스에) 2번 이상 등장했다는 것이므로
            if (count > 1) {
                // 겹치는 길이 1 증가
                intersections++;
            }
        }

        return intersections;
    }
}
