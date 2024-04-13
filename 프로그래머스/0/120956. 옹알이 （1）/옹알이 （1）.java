class Solution {
    public int solution(String[] babbling) {
        String[] able_str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < able_str.length; j++) {
                // 문자열 전체가 공백으로 대체되면 answer에 담아야하는 요소가 된다
                babbling[i] = babbling[i].replace(able_str[j], " ");
            }
            
            // 해당 요소의 공백을 모두 제거했을 때 길이가 0이라면 해당 문자열은 발음 가능한 문자열로만 구성되어있었다는 것 -> answer로 카운트
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}