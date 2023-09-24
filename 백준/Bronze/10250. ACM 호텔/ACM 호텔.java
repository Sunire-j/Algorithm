import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            int height = Integer.parseInt(st.nextToken());//입력높이
            int width = Integer.parseInt(st.nextToken());//입력폭
            int num = Integer.parseInt(st.nextToken());//순번

            int g_h = num%height==0?height:num%height;//손님 방 층수
            sb.append(g_h);

            int g_w = g_h==height?num/height:num/height+1;
            if(g_w<10) sb.append(0).append(g_w);
            else sb.append(g_w);

            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
