import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        for(int i=0; i<5; i++){
            sum+= (int) Math.pow(Double.parseDouble(st.nextToken()), 2);
        }
        sum%=10;
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}

