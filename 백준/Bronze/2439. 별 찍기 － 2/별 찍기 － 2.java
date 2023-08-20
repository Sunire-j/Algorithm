import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i<a; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(a-1-i)).append("*".repeat(i+1)).append("\n");
            bw.write(String.valueOf(sb));
        }
        bw.flush();
        bw.close();
    }
}
