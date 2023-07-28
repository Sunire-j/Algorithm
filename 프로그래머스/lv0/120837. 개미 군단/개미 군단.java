class Solution {
    public int solution(int hp) {
        int temp = hp;

        int answer = 0;
        if(temp%5!=temp){
            answer +=temp/5;
            temp-=temp/5*5;
        }
        if(temp%3!=temp){
            answer+=temp/3;
            temp-=temp/3*3;
        }
        answer+=temp;
        return answer;
    }
}