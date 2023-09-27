import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        for(int i = start; i<=end; i++){
            if(isPrime(i)){
                sb.append(i).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
    static boolean isPrime(int i){
        if(i==1) return false;
        for(int m = 2; m<=Math.sqrt(i); m++){
            if(i%m==0) return false;
        }
        return true;
    }
}