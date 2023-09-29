import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> arr = new HashMap<>();

        for(int i= 0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr.put(num, arr.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++) {
            int target=Integer.parseInt(st.nextToken());
            sb.append(arr.getOrDefault(target, 0)).append(" ");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}