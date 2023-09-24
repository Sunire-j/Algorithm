import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int max = 0;//최대 글자수
        int cnt = Integer.parseInt(br.readLine());//단어 개수
        String [] arr = new String[cnt];
        boolean[] isWrite = new boolean[cnt];

        for(int i = 0; i<cnt ; i++){
            arr[i] = br.readLine();
            if(max<arr[i].length()) max=arr[i].length();//최대 글자수 저장
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length()-o2.length();
                }
            }
        });

        sb.append(arr[0]+"\n");
        for(int i = 1; i<arr.length; i++){
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]+"\n");
            }

        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();


    }
}
