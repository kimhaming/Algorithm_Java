import java.util.Arrays;

class Solution {
    public int solution(int[] array) {

        // 최빈값
        int mode = 0;
        // 최빈값의 개수를 저장할 변수
        int maxCount = 0;

        // 주어진 배열에서 가장 큰 값
        int max = array[array.length - 1];

        // array의 요소 값마다 얼마나 출현하는지 카운트할 배열 생성
        int[] count = new int[1000];

        // 각 숫자의 개수 count 배열에 기록
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // 최빈값 찾기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                mode = i;
                maxCount = count[i];
            }
        }

        // 최빈값 또 있는지 확인하기
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount && i != mode) {
                return -1;
            }
        }

        return mode;
    }
}