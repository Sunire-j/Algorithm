import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int count = 666;
        int _try=0;
        while(true){
            if(String.valueOf(count).contains("666")){
                _try++;
            }
            if(cnt==_try){
                break;
            }
            count++;
        }
        bw.write(count+"");
        bw.flush();
        bw.close();

    }
}
