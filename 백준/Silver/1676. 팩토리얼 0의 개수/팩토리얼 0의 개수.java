import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int zero = 0;

        int N = Integer.parseInt(br.readLine());
        BigInteger temp = new BigInteger("1");

        for(int i = 1; i<=N; i++){
            temp=temp.multiply(BigInteger.valueOf(i));

        }
        while(true){
            if(temp.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0))){
                zero++;
                temp=temp.divide(BigInteger.valueOf(10));
            }else break;
        }
        bw.write(zero+"");
        bw.flush();
        bw.close();
    }
}
