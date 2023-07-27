class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = true;
        for(int i=0; i<code.length();i++){
            if('1' == code.charAt(i)) {
                mode = !mode;
                continue;
            }
            if(mode&&i%2==0) answer.append(code.charAt(i));
            if(!mode&&i%2==1) answer.append(code.charAt(i));
        }
        if(answer.toString().equals("")) return "EMPTY";
        return answer.toString();
    }
}