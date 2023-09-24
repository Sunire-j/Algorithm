import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        char[] arr = String.valueOf(a*b*c).toCharArray();
        int[] result = new int[10];
        for(int i = 0; i<arr.length; i++){
            result[arr[i]-48]++;
        }
        for(int i=0; i<result.length; i++){
            bw.write(result[i]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
