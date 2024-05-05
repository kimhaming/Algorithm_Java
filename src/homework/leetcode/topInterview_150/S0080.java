package homework.leetcode.topInterview_150;

public class S0080 {
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        /*
        if(nums길이가 0이면)
            0 리턴

    // 최소 똑같은 숫자가 3개 있을 때 1개 제거하여 2개 출려되는 거니까
    // 출력될 숫자는 최소 2부터 이다. -> int k = 2; 초기화
         */
        if (nums.length == 0) {
            return 0;
        }
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[k-2] != nums[i]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
