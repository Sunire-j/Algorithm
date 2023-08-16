import java.io.*;

public class Solution {
    static int process(int a, int b){
        if(b==0) return 1;
        return a*process(a, --b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = 10;
        while(caseNum!=0){
            int a = Integer.parseInt(br.readLine()); // 케이스 번호
            String[] temp = br.readLine().split(" ");
            int b = Integer.parseInt(temp[0]);
            int c = Integer.parseInt(temp[1]);
            System.out.println("#"+a+" "+process(b, c));
            caseNum--;
        }
    }
}