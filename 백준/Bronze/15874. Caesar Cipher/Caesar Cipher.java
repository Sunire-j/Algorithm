import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int move = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==32 || arr[i]==44 || arr[i]==46){
                bw.write(arr[i]);
            }else if(arr[i]<=90 && arr[i]>=65){
                bw.write((char) ((arr[i]-65+26+move)%26+65));
            }else{
                bw.write((char)((arr[i]-97+26+move)%26+97));
            }
        }
        bw.flush();
        bw.close();
    }
}
