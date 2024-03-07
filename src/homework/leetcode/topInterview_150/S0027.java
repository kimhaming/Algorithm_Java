package homework.leetcode.topInterview_150;

public class S0027 {
    // https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
    public static void main (String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        // Output: 남은 요소의 개수, nums = [2,2, , ]
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        // nums에서 val를 지워서 남는 요소의 개수
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            // 제거해야 하는 값에 해당할 때에는 그냥 넘어가고,
            // 남겨야 하는 값에 해당할 때에만 가장 앞으로 땡긴 위치에 새롭게 저장해주기
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
