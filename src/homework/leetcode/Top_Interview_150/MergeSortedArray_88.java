package homework.leetcode.Top_Interview_150;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    // Todo:
    //      for (m부터 num1.length만큼 반복) {
    //          num1[m부터 유효한 자리까지 복사] = num2[0부터 끝까지];
    //      num1 오름차순 정렬;
    //      num1 출력;
    //  }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[cnt];
            cnt++;
            }

        Arrays.sort(nums1);
        }
    }
