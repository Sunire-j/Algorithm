import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] arr;
    static int switchNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        switchNum = Integer.parseInt(br.readLine());
        arr = new int[switchNum+1];
        int index = 1;
        String[] s = br.readLine().split(" ");
        for (String s1 : s) {
            arr[index++] = Integer.parseInt(s1);
        }
        int stdnum = Integer.parseInt(br.readLine());
        for (int i = 0; i < stdnum; i++) {
            String[] s2 = br.readLine().split(" ");
            int sex = Integer.parseInt(s2[0]);
            int num = Integer.parseInt(s2[1]);
            if (sex == 1) male(num);
            else female(num);
        }
        for(int i = 1; i<=switchNum;i++){
            System.out.print(arr[i]);
            if(i%20!=0) System.out.print(" ");
            else System.out.println();
        }
    }

    static void male(int num) {
        for (int i = num; i <= switchNum; i+=num) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }

    static void female(int num) {
        int i=0;
        while(arr[num+i]==arr[num-i]){
            i++;
            if(num+i>=arr.length||num-i<1) break;
        }
        i--;
        if (arr[num] == 0) arr[num] = 1;
        else arr[num] = 0;
        for (int j = 1; j <= i; j++) {
            if (arr[num + j] == 0) arr[num + j] = arr[num - j] = 1;
            else arr[num + j] = arr[num - j] = 0;
        }
    }
}
