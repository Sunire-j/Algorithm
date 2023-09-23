import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());

        for(int i = 0; i<c; i++){
            st= new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();
            for(int a = 0; a<arr.length; a++){
                for(int b = 0; b<count; b++){
                    sb.append(arr[a]);
                }
            }
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}