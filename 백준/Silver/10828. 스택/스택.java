import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Stack<Integer> stack = new Stack<Integer>();

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            if(temp.equals("push")){
                int push = Integer.parseInt(st.nextToken());
                stack.push(push);
            }else if(temp.equals("pop")){
                if(stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.pop()).append("\n");
            }else if(temp.equals("size")) sb.append(stack.size()).append("\n");
            else if(temp.equals("empty")){
                if(stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
            else{
                if(stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.peek()).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
