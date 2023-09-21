import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[Integer.parseInt(st.nextToken())];
        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }

        int c = Integer.parseInt(st.nextToken());
        for(int i = 0; i<c; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            while(a<b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        for(int i : arr){
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
    }
}

