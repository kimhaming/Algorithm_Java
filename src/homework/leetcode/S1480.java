package homework.leetcode;

import java.util.Arrays;

public class S1480 {
    // https://leetcode.com/problems/running-sum-of-1d-array/description/

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    // int[] answer = {1, 3, 6, 10}
    // answer[0] == nums[0]
    // answer[1] == nums[1] + answer[0]
    // answer[2] == nums[2] + answer[1]
    // answer[3] == nums[3] + answer[2]
    // answer[i] == nums[i] + answer[i-1]
    public static int[] runningSum(int[] nums) {
        // 출력할 변수 배열 answer 을 선언합니다.
        // 입출력예제를 통해 nums.length 크기의 배열의 형태를 가지는 것을 확인할 수 있습니다.
        int[] answer = new int[nums.length];

        // 입력된 배열의 0 인덱스와 출력할 배열의 0 인덱스 값은 동일합니다.
        answer[0] = nums[0];

        // 인덱스 0의 값은 저장하였으므로, 1부터 마지막 인덱스까지 순회하며 값을 지정해줍니다.
        for (int i = 1; i < answer.length; i++) {
            // 입출력예제를 통해 구해야하는 자리의 값은 입력된 배열의 같은 인덱스 값 + 출력할 배열의 이전 인덱스 값의 합임을 알 수 있습니다.
            answer[i] = nums[i] + answer[i-1];
        }
        return answer;
    }
}
