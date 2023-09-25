import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = 0;
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<arr.length-2; i++){
            for(int second = i+1; second<arr.length-1; second++){

                for(int third = second+1; third<arr.length; third++){
                    int sum = arr[i]+arr[second]+arr[third];
                    if(sum>M) continue;
                    else if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        bw.write(max+"");
        bw.flush();
        bw.close();


    }
}
