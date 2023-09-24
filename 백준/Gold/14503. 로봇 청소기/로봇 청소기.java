import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static int x;
    static int y;
    static int direction;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++) {
            st=new StringTokenizer(br.readLine()," ");
            for (int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        start();
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    public static void start() {
        final int[] dx={-1, 0, 1, 0}; // 북 동 남 서 순서
        final int[] dy={0, 1, 0, -1};

        loop: while(true) {
            if(arr[x][y]==0){
                arr[x][y] +=2; // 청소 표시
                count++;
            }

            for(int i=0;i<4;i++){
                direction=(direction+3)%4;//방향 전환(반시계 방향)
                //다음 위치 설정
                int nx=x+dx[direction];
                int ny=y+dy[direction];

                if(nx>=0 && nx<arr.length && ny>=0 && ny<arr[0].length){
                    if(arr[nx][ny]==0){
                        x=nx;y=ny;
                        continue loop;//청소 가능하면 이동 후 처음부터 반복
                    }
                }
            }

            //네 방향 모두 청소가 되어있거나 벽인 경우 후진 시도
            if(arr[x-dx[direction]][y-dy[direction]]!=1){
                x -= dx[direction];
                y -= dy[direction];

            } else break;// 뒤쪽 방향이 벽이라 후진도 못하는 경우 작동 멈춤.

        }
    }
}
