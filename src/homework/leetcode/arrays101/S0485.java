package homework.leetcode.arrays101;

public class S0485 {
    // https://leetcode.com/problems/max-consecutive-ones/description/

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
        // Output -> 2
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        // 결론적으로 리턴할 정답 (문제에서 바라는 결과값)
        int max = 0;
        // max가 분명하게 정해지기 전에 max가 되기 위해 세어지고 있던 수
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                // 요소의 값이 1일 때마다 count++
                count++;
                // 인덱스를 탐색하며 1이 나타날 때마다 max 를 현재 연속값 count와 비교하여 저장
                max = Math.max(max, count);
                // 요소의 값으로 정수 0 이 나타나면 연속이 끊기므로, 세고있던 count 리셋
            } else {
                count = 0;
            }
        }

        return max;
    }
}
