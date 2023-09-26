import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] compare = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            compare[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(compare);
        int m = Integer.parseInt(br.readLine());
        int[] target = new int[m];

        st=new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++){
            target[i]= Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<target.length; i++){
            int start = 0;
            int max = compare.length-1;
            while(true){
                int mid = (start+max)/2;
                if(start>max){
                    sb.append("0\n");
                    break;
                }
                if(target[i]>compare[max]){
                    sb.append("0\n");
                    break;
                }
                if(compare[mid]==target[i]){//같으면
                    sb.append("1\n");
                    break;
                } else if (compare[mid]<target[i]) {
                    start=mid+1;
                } else if (compare[mid]>target[i]) {
                    max=mid-1;
                }
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }
}
