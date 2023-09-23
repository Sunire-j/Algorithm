import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//

// 비바라기를 시전하면 하늘에 비구름을 만들 수 있다.
// 오늘은 비바라기를 크기가 N×N인 격자에서 연습하려고 한다.
// 격자의 각 칸에는 바구니가 하나 있고, 바구니는 칸 전체를 차지한다.
// 바구니에 저장할 수 있는 물의 양에는 제한이 없다.
// (r, c)는 격자의 r행 c열에 있는 바구니를 의미하고, A[r][c]는 (r, c)에 있는 바구니에 저장되어 있는 물의 양을 의미한다.
//
//격자의 가장 왼쪽 윗 칸은 (1, 1)이고, 가장 오른쪽 아랫 칸은 (N, N)이다.

// 마법사 상어는 연습을 위해 1번 행과 N번 행을 연결했고,
// 1번 열과 N번 열도 연결했다.
// 즉, N번 행의 아래에는 1번 행이, 1번 행의 위에는 N번 행이 있고,
// 1번 열의 왼쪽에는 N번 열이, N번 열의 오른쪽에는 1번 열이 있다.
//
//비바라기를 시전하면 (N, 1), (N, 2), (N-1, 1), (N-1, 2)에 비구름이 생긴다.
// 구름은 칸 전체를 차지한다. 이제 구름에 이동을 M번 명령하려고 한다.
// i번째 이동 명령은 방향 di과 거리 si로 이루어져 있다.
// 방향은 총 8개의 방향이 있으며, 8개의 정수로 표현한다.
// 1부터 순서대로 ←, ↖, ↑, ↗, →, ↘, ↓, ↙ 이다.
// 이동을 명령하면 다음이 순서대로 진행된다.
//
//1. 모든 구름이 di 방향으로 si칸 이동한다.
//2. 각 구름에서 비가 내려 구름이 있는 칸의 바구니에 저장된 물의 양이 1 증가한다.
//3. 구름이 모두 사라진다.
//4. 2에서 물이 증가한 칸 (r, c)에 물복사버그 마법을 시전한다. 물복사버그 마법을 사용하면, 대각선 방향으로 거리가 1인 칸에 물이 있는 바구니의 수만큼 (r, c)에 있는 바구니의 물이 양이 증가한다.
//  이때는 이동과 다르게 경계를 넘어가는 칸은 대각선 방향으로 거리가 1인 칸이 아니다.
//  예를 들어, (N, 2)에서 인접한 대각선 칸은 (N-1, 1), (N-1, 3)이고, (N, N)에서 인접한 대각선 칸은 (N-1, N-1)뿐이다.
//5. 바구니에 저장된 물의 양이 2 이상인 모든 칸에 구름이 생기고, 물의 양이 2 줄어든다. 이때 구름이 생기는 칸은 3에서 구름이 사라진 칸이 아니어야 한다.

//M번의 이동이 모두 끝난 후 바구니에 들어있는 물의 양의 합을 구해보자.

public class Main {
    static int[][] arr; //물 양 정보 배열
    static boolean[][] cloud_before; //구름 정보 배열
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] dirX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dirY = {0, -1, -1, -1, 0, 1, 1, 1};

    public static boolean[][] StartMove(int direction, int length) {
        boolean[][] cloud_after = new boolean[arr.length][arr.length];

        //1. 구름 이동
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (cloud_before[r][c]) {

                    int after_r=fixPosition(r+(dirY[direction-1]*length));
                    int after_c =fixPosition(c+(dirX[direction-1]*length));

                    cloud_after[after_r][after_c] = true;
                    //2. 구름 위치 물 양 1증가
                    arr[after_r][after_c]+=1;
                }
            }
        }
        cloud_before=cloud_after;
        cloud_after=new boolean[arr.length][arr.length];

        //3. 구름있는 위치 대각선 체크 후 물 증가(대각선 한 곳당 1씩 증가)
        for(int r =0; r<arr.length; r++){
            for(int c = 0; c<arr.length;c++){
                if(cloud_before[r][c]){
                    //구름있는 위치 도착했음
                    //대각선 체크해야함

                    //(-1, -1)방향체크
                    if(0<=r-1 && r-1< arr.length && 0<=c-1){
                        if(arr[r-1][c-1]>0) arr[r][c]++;
                    }
                    // (-1,+1)
                    if(0<=r-1 && r-1< arr.length&& c+1<arr.length){
                        if(arr[r-1][c+1]>0) arr[r][c]++;
                    }
                    //(+1, -1)
                    if(r+1< arr.length && 0<=c-1 && c-1<arr.length){
                        if(arr[r+1][c-1]>0) arr[r][c]++;
                    }
                    // , (+1, +1)
                    if(r+1< arr.length&& c+1<arr.length){
                        if(arr[r+1][c+1]>0) arr[r][c]++;
                    }
                    //이놈들이 물이 있냐 없냐만 체크할거임.
                    //있으면 ++
                }
            }
        }
        //대각선체크 끝

        //4. 현재 구름위치 false, 그 이외 곳 중 2 이상인 곳 true
        for(int r=0; r<arr.length; r++){
            for(int c = 0; c<arr.length; c++){
                if(arr[r][c]>=2&&!cloud_before[r][c]){
                    cloud_after[r][c]= true;
                    arr[r][c]-=2;
                }
            }
        }
        //5. 반복
        return cloud_after;
    }

    public static int fixPosition(int a){
        while(a<0){
            a+=arr.length;
        }
        a=a%arr.length;
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp = Integer.parseInt(st.nextToken()); //격자 크기
        int move = Integer.parseInt(st.nextToken()); //움직일 횟수
        //격자 입력
        arr = new int[temp][temp];

        for (int i = 0; i < temp; i++) {
            st = new StringTokenizer(br.readLine());
            for (int a = 0; a < temp; a++) {
                arr[i][a] = Integer.parseInt(st.nextToken());
            }
        }
        //격자입력 끝
        cloud_before = new boolean[arr.length][arr.length];
        cloud_before[temp - 1][0] = cloud_before[temp - 2][0] = cloud_before[temp - 1][1] = cloud_before[temp - 2][1] = true;

        //움직임 입력 시작
        for (int i = 0; i < move; i++) {
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            cloud_before = StartMove(direction, length);
        }



        int sum = 0;
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr.length; c++){
                sum+=arr[r][c];
            }
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }

}

