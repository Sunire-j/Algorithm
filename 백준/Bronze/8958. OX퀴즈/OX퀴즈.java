import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int try_cnt = Integer.parseInt(br.readLine());
        char[] arr;
        int bonus=0;

        for(int i = 0; i<try_cnt; i++){
            arr = br.readLine().toCharArray();
            int score=0;
            for(int a = 0; a<arr.length; a++){
                if(arr[a]=='O'){
                    score=score+1+bonus;
                    bonus++;
                }else{
                    bonus=0;
                }
            }
            bw.write(score+"\n");
            bonus=0;
        }

        bw.flush();
        bw.close();

    }
}