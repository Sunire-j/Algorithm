import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int count=0;
        for(int i = 0; i<N; i++){
            if(isPrime(Integer.parseInt(st.nextToken()))){
                count++;
            }
        }
        bw.write(count+"");
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