import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int index = Integer.parseInt(st.nextToken());

        for(int i = 0; i<index; i++){
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())-1]+=1;
            arr[Integer.parseInt(st.nextToken())-1]+=1;
        }
        for(int i : arr){
            bw.write(i+"");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}