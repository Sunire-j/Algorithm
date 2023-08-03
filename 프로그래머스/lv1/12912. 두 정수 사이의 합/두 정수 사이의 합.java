class Solution {
    public long solution(int a, int b) {
        long answer = b;
        boolean direction = true;
        if(a>b) direction = false;
        for(; a!=b;){
            answer+=a;
            if(direction) a++;
            else a--;
        }
        return answer;
    }
}