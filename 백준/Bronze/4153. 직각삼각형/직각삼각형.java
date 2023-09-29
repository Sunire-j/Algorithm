import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String temp = br.readLine();
            if (temp.equals("0 0 0")) break;
            st = new StringTokenizer(temp);
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2]= Integer.parseInt(st.nextToken());
            Arrays.sort(arr);//맥스가 2임
            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) sb.append("right\n");
            else sb.append("wrong\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}