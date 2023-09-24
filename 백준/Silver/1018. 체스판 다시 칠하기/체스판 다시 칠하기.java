import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        int min = 64;

        char[][] board = new char[height][width];
        for (int i = 0; i < height; i++) {
            char[] temp = br.readLine().toCharArray();
            for (int a = 0; a < width; a++) {
                board[i][a] = temp[a];
            }
        }

        for (int i = 0; width - i >= 8; i++) {//i가 x값, 즉 열을 움직이는[x][y]라고 하면 y가 움직이는거임.
            for (int h = 0; height - h >= 8; h++) {//h가 y값, 즉 행을 움직이는 [x][y]라고하면 x가 움직이는거임.
                //8x8임시판 움직임 완료
                int count_temp = 0;//min에 넣기전 임시변수
                char start = board[h][i]; //시작지점 문자저장
                //그럼 여기서부터 체크를 시작해야해.
                //체크할 때 왔다갔다를 어떻게 체크하지?
                //거리가 짝수면 start와 같아야함
                //거리가 홀수면 start와 달라야함

                for (int col = 0; col < 8; col++) {
                    for (int row = 0; row < 8; row++) {
                        //이제 여기서부터 정해진 8x8안에서 체크를 시작할거임
                        if (col + row == 0) continue;
                        if ((col + row) % 2 == 0 && board[h + row][i + col] != start) {//짝수라면 start와 같아야함
                            count_temp++;
                        } else if ((col + row) % 2 == 1 && board[h + row][i + col] == start) {
                            count_temp++;
                        }

                    }
                }
                //체크가 끝났음 이제 저장을 해야지?
                if (min > count_temp) min = count_temp;



                //좌측상단을 바꾼다면?

                count_temp = 1;//min에 넣기전 임시변수
                start = board[h][i]=='B'?'W':'B'; //시작지점 문자저장
                //그럼 여기서부터 체크를 시작해야해.
                //체크할 때 왔다갔다를 어떻게 체크하지?
                //거리가 짝수면 start와 같아야함
                //거리가 홀수면 start와 달라야함

                for (int col = 0; col < 8; col++) {
                    for (int row = 0; row < 8; row++) {
                        //이제 여기서부터 정해진 8x8안에서 체크를 시작할거임
                        if (col + row == 0) continue;
                        if ((col + row) % 2 == 0 && board[h + row][i + col] != start) {//짝수라면 start와 같아야함
                            count_temp++;
                        } else if ((col + row) % 2 == 1 && board[h + row][i + col] == start) {
                            count_temp++;
                        }

                    }
                }
                //체크가 끝났음 이제 저장을 해야지?
                if (min > count_temp) min = count_temp;

            }
        }
        bw.write(min + "");
        bw.flush();
        bw.close();

    }
}
