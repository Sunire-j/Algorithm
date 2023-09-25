import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            start(left, right);
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void start(int left, int right){
        BigInteger temp = BigInteger.valueOf(1);
        for(int i = 0; i<left; i++){
            temp = temp.multiply(BigInteger.valueOf(right-i));
        }
        for(int i = 0; i<left; i++){
            temp = temp.divide(BigInteger.valueOf(left-i));
        }
        sb.append(temp).append("\n");
    }
}
