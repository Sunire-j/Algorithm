import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int prev=0;
        int result=0;

        int i = Integer.parseInt(br.readLine());
        int[] arr = new int[i];
        for(int n = 0; n<i; n++){
            arr[n] = Integer.parseInt(br.readLine());
        }
        for(int n = i-1; n>=0; n--){
            if(arr[n]>prev){
                prev = arr[n];
                result++;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}