import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int kg5 = 0, kg3 = 0;

        if(A%5==0) {
            System.out.println(A/5);
            exit(0);
        }
        kg5=A/5;
        A = A%5;
        for(; kg5>=0; kg5--){
            if(A%3==0){
                kg3+=A/3;
                System.out.println(kg5+kg3);
                break;
            }
            if(kg5==0) {
                System.out.println(-1);
                break;
            }
            A +=5;
        }
    }
}