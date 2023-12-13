class Solution {
    public int solution(String[] babbling) {
        // Todo:
        //  1. 발음할 수 있는 단어 4가지 요소 외에 문자 단 1개라도 포함되면 발음 불가능한 단어
        //  2. babbling 에 있는 String 을 하나씩 꺼내와서
        //  3. b 에 s 가 들어있으면 공백으로 변경
        //  4. 공백을 ""으로 대체하고 남은게 없다면 발음가능한 단어 -> answer++
        
        int answer = 0;
        
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            for(String s : str) {
                b = b.replace(s, " ");
            }
            if (b.replaceAll(" ", "").equals("")) {
                answer++;
            }
                }
        return answer;
    }
}