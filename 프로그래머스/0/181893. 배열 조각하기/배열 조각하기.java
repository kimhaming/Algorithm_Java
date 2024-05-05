import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // query 배열의 인덱스가 0일 때, 1일 때 조건문 따로 빼고
        // 2부터는 짝수, 홀수 일 때의 조건문 나누기
        // 짝수: arr = arr[0] ~ arr[query[i]] 까지로 새로 만들기
        // 홀수: arr = arr[query[i]] ~ arr[arr.length-1] 까지로 새로 만들기
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            }
            else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        return arr;
        
    }
}