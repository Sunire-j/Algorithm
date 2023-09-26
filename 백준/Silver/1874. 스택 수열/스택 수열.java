import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        int n = Integer.parseInt(br.readLine());
        int[] target = new int[n];

        for(int i = 0; i<n; i++){
            target[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        int target_index = 0;
        boolean b= true;
        try {
            do {
                stack.push(num++);
                sb.append("+\n");
                if(num>n+1){
                    throw new Exception();
                }
                if(!stack.isEmpty()) {
                    while (stack.peek() == target[target_index]) {
                        stack.pop();
                        target_index++;
                        sb.append("-\n");
                        if (target_index == target.length) {
                            b = false;
                            break;
                        }
                        if(stack.isEmpty()) break;
                    }
                }
            } while (b);
            bw.write(String.valueOf(sb));
        }catch (Exception e){
            bw.write("NO");
        }finally{
            bw.flush();
            bw.close();
        }
    }
}
