import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int wires_num = Integer.parseInt(st.nextToken());
        int need_num = Integer.parseInt(st.nextToken());
        int[] arr = new int[wires_num];

        long start=1;
        long end=0;
        for(int i = 0; i<wires_num; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(end<arr[i]) end=arr[i];
        }

        while(start<=end){
            long mid=(start+end)/2;
            long count = 0;

            for(int i = 0; i<arr.length; i++){
                count+=arr[i]/mid;
            }
            if(count<need_num) end=mid-1;
            else if(count>=need_num) start=mid+1;
        }

        //이진탐색에는 start, end, mid가 있음
        //mid는 (start+end)/2임
        //만약에 count가 필요수보다 작다?->end를 mid위치까지 데려옴
        //만약에 count가 필요수보다 크다?->start를 mid위치까지 데려옴
        //만약 count가 필요수와 같다->start+1




        bw.write((end)+"");
        bw.flush();
        bw.close();


    }
}
