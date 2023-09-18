import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<Integer>();
        int prev=0;
        int result=0;

        int i = Integer.parseInt(br.readLine());
        for(int n = 0; n<i; n++){
            stack.push(Integer.valueOf(br.readLine()));
        }
        for(int n = 0; n<i; n++){
            int temp = stack.pop();
            if(temp>prev){
                prev = temp;
                result++;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}