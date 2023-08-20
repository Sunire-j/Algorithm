import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        for (int i = 0; i < r; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum = sum - Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        System.out.println((sum == 0) ? "Yes" : "No");
    }
}
