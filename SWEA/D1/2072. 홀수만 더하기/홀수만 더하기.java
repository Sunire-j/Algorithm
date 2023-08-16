import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i<cnt; i++){
            int sum = 0;
            String[] arr = br.readLine().split(" ");
            for(int o = 0; o<10; o++){
                if(Integer.parseInt(arr[o])%2==1){
                    sum+=Integer.parseInt(arr[o]);
                }
            }
            bw.write("#"+(i+1)+" "+sum+"\n");
            bw.flush();
        }
        bw.close();
    }
}