import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            if(check()) sb.append("YES\n");
            else sb.append("NO\n");
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static boolean check() throws IOException {
        char[] arr = br.readLine().toCharArray();
        if(arr[0]!='(') return false;
        int count = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]=='(') count++;
            else count--;
            if(count<0) return false;
        }
        if(count==0) return true;
        else return false;
    }
}