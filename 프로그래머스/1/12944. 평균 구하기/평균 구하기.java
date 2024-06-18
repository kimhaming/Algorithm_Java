class Solution {
    public double solution(int[] arr) {
        double average = 0;
       double sum = 0;
       // arr의 전체 요소들을 탐색해서 double 실수값 평균을 구하세요
        for (int num : arr) {
            sum += num;
        }
        average = sum / arr.length;
       return average;
    }
}