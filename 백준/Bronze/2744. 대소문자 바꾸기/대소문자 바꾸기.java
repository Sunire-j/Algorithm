import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        char[] arr= br.readLine().toCharArray();
        for (char c : arr) {
            if (65 <= c && c <= 90) {
                sb.append((char) (c + 32));
            } else {
                sb.append((char) (c - 32));
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

