class Solution {
    public static int[] solution(long n) {
        int[] answer = new int[(int) Math.log10(n)+1];
        int index=0;
        while(0 < n){
            answer[index]= (int) (n%10);
            index++;
            n/=10;
        }
        return answer;
    }
}