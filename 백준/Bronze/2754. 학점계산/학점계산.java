import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String score = br.readLine();
        float _score = 0;
        if (score.equals("F")) {
            bw.write("0.0");
            bw.flush();
            bw.close();
        } else {
            char[] arr = score.toCharArray();
            switch (arr[0]) {
                case 'A':
                    _score = 4.0F;
                    break;
                case 'B':
                    _score = 3.0F;
                    break;
                case 'C':
                    _score = 2.0F;
                    break;
                case 'D':
                    _score = 1.0F;
                    break;
                default:
            }
            switch (arr[1]) {
                case '+':
                    _score += 0.3F;
                    break;
                case '-':
                    _score -= 0.3F;
                    break;
                default:
            }
            bw.write(_score+"");
            bw.flush();
            bw.close();
        }


    }
}

