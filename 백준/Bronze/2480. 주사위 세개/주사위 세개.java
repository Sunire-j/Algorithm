import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(a==b&&b==c) System.out.println(10000+a*1000);
        else if (a==b ||b==c || a==c){
            int temp;
            if(a==b) temp =a;
            else if(b==c) temp = b;
            else temp = c;
            System.out.println(1000+temp*100);
        }
        else System.out.println(Math.max(a,Math.max(b,c))*100);

    }
}
