import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] isCheck = new boolean[26];//초기값 false임 체크하면 true로 바꿔야함
        int[] abc_arr = new int[26];//초기값 0, 인덱스입력시 +1해서 입력할거임. 출력할때는 -1해줄거임.

        char[] input_arr = br.readLine().toCharArray();

        for(int i = 0; i< input_arr.length; i++){
            if(!isCheck[input_arr[i]-97]){//처음본놈이 맞으면?
                abc_arr[input_arr[i]-97]=i+1;
                isCheck[input_arr[i]-97]=true;
            }
        }
        for(int i =0; i<abc_arr.length; i++){
            bw.write((abc_arr[i]-1)+" ");
        }

        bw.flush();
        bw.close();

    }
}
