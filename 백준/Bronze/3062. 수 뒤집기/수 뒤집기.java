import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i<num; i++){
            check();
            if(i!=num-1) bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
    static void check() throws IOException {
        StringBuilder sb = new StringBuilder(br.readLine());
        int num = Integer.parseInt(String.valueOf(sb))+Integer.parseInt(String.valueOf(sb.reverse()));
        sb.delete(0, sb.length());
        sb.append(num);
        for(int i = 0; i<sb.length()/2; i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
                bw.write("NO");
                return;
            }
        }
        bw.write("YES");
    }
}