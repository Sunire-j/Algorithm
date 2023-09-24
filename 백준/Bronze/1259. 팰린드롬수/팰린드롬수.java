import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            boolean b = true;
            int temp = Integer.parseInt(br.readLine());
            if(temp==0) break;
            char[] arr = String.valueOf(temp).toCharArray();
            for(int i = 0; i<arr.length/2; i++){
                if(arr[i]!=arr[arr.length-1-i]){
                    bw.write("no");
                    bw.newLine();
                    b = false;
                    break;
                }
            }
            if(!b) continue;
            bw.write("yes");
            bw.newLine();

        }

        bw.flush();
        bw.close();


    }
}
