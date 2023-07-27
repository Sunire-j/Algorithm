import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = arr;

        for(int i=1; i<query.length+1; i++){
            if(i%2==1){
                answer = Arrays.copyOfRange(answer,0,query[i-1]+1);
            }else{
                answer = Arrays.copyOfRange(answer, query[i-1], answer.length);
            }
        }
        return answer;
    }
}