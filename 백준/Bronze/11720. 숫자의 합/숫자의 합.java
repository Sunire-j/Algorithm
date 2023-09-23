import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        char[] arr = br.readLine().toCharArray();
        int sum=0;
        for(int i = 0; i<arr.length; i++){
            sum+=(int) arr[i] - '0';
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}