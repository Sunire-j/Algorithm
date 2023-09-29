import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder("<");

        int length = Integer.parseInt(st.nextToken());
        int interval = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        boolean [] arr_b = new boolean[length];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int point = interval-1;

        for(int i = 0; i<arr.length; i++){
            sb.append(arr[point]);
            arr_b[point] = true;
            if(i!=arr.length-1) sb.append(", ");
            else {
                sb.append(">");
                break;
            }
            for(int a = 0; a<interval; a++){
                point=(point+1)%length;
                while(arr_b[point]) point=(point+1)%length;
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}