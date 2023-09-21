import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        float[] arr = new float[Integer.parseInt(br.readLine())];
        float max = 0;
        float sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr.length; i++){
            arr[i]= Integer.parseInt(st.nextToken());
            if(max<arr[i]) max=arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            arr[i]=arr[i]/max*100;
            sum+=arr[i]/arr.length;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}

