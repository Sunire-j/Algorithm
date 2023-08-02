class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                answer+=i;
                answer+=n/i;
            }
        }

        if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n) {
            answer-=(int)Math.sqrt(n);
        }
        return answer;
    }
}