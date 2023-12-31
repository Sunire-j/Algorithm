import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i =0; i<arr.length; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int i =0; i<arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}