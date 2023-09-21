import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] arr= new int[row][col];

        for(int i = 0; i<row*2; i++){
            st= new StringTokenizer(br.readLine());
            for(int a = 0; a<col; a++){
                arr[i%row][a] += Integer.parseInt(st.nextToken());
                if(i/row==1) sb.append(arr[i % row][a]).append(" ");
            }
            if(i/row==1) sb.append("\n");

        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

