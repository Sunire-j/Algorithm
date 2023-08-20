import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken())+Integer.parseInt(br.readLine());
        if(m>=60){
            int temp = m/60;
            m%=60;
            h+=temp;
            if(h>23) h-=24;
        }
        System.out.println(h+" "+m);
    }
}
