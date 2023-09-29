import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            char[] arr = br.readLine().toCharArray();
            if (arr[0] == '0') break;
            int width = 2;
            width += (arr.length - 1) + arr.length * 3;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '0') width += 1;
                if (arr[i] == '1') width -= 1;
            }
            bw.write(width+"\n");
            bw.flush();
        }
        bw.close();

    }
}