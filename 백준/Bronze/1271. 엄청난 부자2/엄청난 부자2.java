import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        BigInteger money = new BigInteger(st.nextToken());
        BigInteger num = new BigInteger(st.nextToken());
        sb.append(money.divide(num)).append(" ").append(money.remainder(num));
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

