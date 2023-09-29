import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int ra = 0;
        int rb = 0;
        ra += A/100;
        rb += B/100;
        A-=A/100*100;
        B-=B/100*100;
        ra+=A/10*10;
        rb+=B/10*10;
        A-=A/10*10;
        B-=B/10*10;
        ra+=A*100;
        rb+=B*100;
        if(ra>rb) bw.write(ra+"");
        else bw.write(rb+"");
        bw.flush();
        bw.close();

    }
}