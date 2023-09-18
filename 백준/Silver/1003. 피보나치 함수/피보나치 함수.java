import java.io.*;

public class Main {
    static int num0 = 0;
    static int num1 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        for(int index = 0; index<i; index++){
            fibonacci(Integer.parseInt(br.readLine()));
            bw.write(num0+" ");
            bw.write(num1+"");
            bw.newLine();
            num0=0;
            num1=0;
        }

        bw.flush();
        bw.close();

    }

    public static void fibonacci(int n) {
        //여기서 구해야하는 것
        //1. n번째 피보나치 수
        //2. n-1번째 피보나치 수 끝
        //그럼 반복문을 돌리는게 훨씬 빠름
        int fibo1 =0; //n-2
        int fibo2=1; //n-1
        int temp;
        if(n==0) {
            num0=1;
            return;
        }
        if(n==1){
            num1=1;
            return;
        }
        for(int i = 2; i<=n; i++){
            temp=fibo2;
            fibo2=fibo1+fibo2;
            fibo1=temp;
        }
        num0=fibo1;
        num1=fibo2;
    }
}