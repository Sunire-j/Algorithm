import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < num; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (min > temp) min = temp;
            if (max < temp) max = temp;
        }
        System.out.println(min + " " + max);
    }
}
