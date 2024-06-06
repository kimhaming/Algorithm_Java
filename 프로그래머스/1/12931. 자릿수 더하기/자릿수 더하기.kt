class Solution {
    fun solution(n: Int): Int {
        var input = n
        var answer = 0
        while (input > 0) {
            // n: 123을 10으로 나눈 나머지 = 3 -> 2 -> 1 ... 을 더할 것
            answer += input % 10
            // 더하면서 n은 123 -> 12 -> 1 로 변할 것
            input /= 10
        }

        return answer
    }
}