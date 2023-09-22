import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr= br.readLine().toCharArray();
        bw.write(arr.length+"");
        bw.flush();
        bw.close();
    }
}

