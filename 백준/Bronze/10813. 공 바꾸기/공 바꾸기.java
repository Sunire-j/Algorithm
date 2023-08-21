import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        arr = new int[Integer.parseInt(st.nextToken())];
        int tries = Integer.parseInt(st.nextToken());

        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for(int i = 0; tries>i; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
