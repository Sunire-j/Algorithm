import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean[] b = new boolean[30];

        for(int i = 0; i<28; i++){
            int temp = Integer.parseInt(br.readLine());
            b[temp-1] = true;
        }
        for(int i = 0; i<30; i++){
            if(!b[i]) bw.write((i+1)+"\n");
        }
        bw.flush();
        bw.close();
    }
}