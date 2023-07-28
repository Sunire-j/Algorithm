class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String value : s1) {
            for (String s : s2) {
                if (value.equals(s)) answer++;
            }
        }
        return answer;
    }
}