class Solution {
    public int solution(String my_string) {
        char[] temp = my_string.toCharArray();
        int answer = 0;
        for(int i = 0; i<temp.length; i++){
            if((int)temp[i]>=48&&(int)temp[i]<=57) answer+=Character.getNumericValue(temp[i]);
        }
        return answer;
    }
}