import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    //해결된 문제 개수, 패널티 총합, 순위는 문제 개수로, 문제 개수 같으면 패널티 적은사람이 높은 순위
    //첫줄에 참가자의 수, 이후 첫줄 수만큼 문제개수, 패널티 총합 주어짐
    //5등수준의 맞춘문제 알아냄->그 안에서 패널티 최소치 제외하고 카운트함
    //문제수랑 패널티 다 같은 학생x->5등안에서 같은 학생 없음
    //패널티를 굳이 받을 필요가 있을까? 그냥 5등 맞춘문제랑 같은 사람 세서 -1하면 되잖
    //아 근데 이슈가 있음 1,2등이 5문제, 3,4,5,6,7이 3문제를 맞췄다면
    //5등과 같은 5명에서 -1로 해결이 안됨. 2명이 나와야함.
    //결국 패널티도 입력을 받아야함. 그래야 이슈가 없음
    //이차원배열로 받아서 람다식으로 정렬해야한다(검색으로 알아냄)
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[][] score;

    public static void main(String[] args) throws IOException {
        int unlucky = 0;
        int stdnum = Integer.parseInt(br.readLine());//학생수 입력
        score = new int[stdnum][2];

        for (int i = 0; i < stdnum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            score[i][0] = Integer.parseInt(st.nextToken());
            score[i][1] = Integer.parseInt(st.nextToken());
        }
        //Arrays.sort(score, (o2, o1) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]); //맞춘문제기준 내림차순(이건 공부좀 해야함)
        Arrays.sort(score,(o2,o1)->{
            if(o1[0]==o2[0]) return o2[1]-o1[1];
            else return o1[0]-o2[0];
        });
        //정렬은 다 했음, 이제 그냥 위에서부터 자르고? 5등 맞춘수를 뽑고? 그 아래쪽에 같은문제 몇명이나 있는지 카운트

        int temp1 = score[4][0]; //5등 맞춘 문제 수 <--이걸 4로 딱 고정시킨게 문제인 것 같음.
        int temp2 = score[4][1]; //5등 패널티 수

        for (int i = 5; i < stdnum; i++) {
            if (score[i][0] == temp1 && score[i][1] > temp2) unlucky++;
            if (score[i][0] < temp1) break;//정렬되어있으니 맞춘문제 적어지면 걍 끝냄
        }
        bw.write(unlucky+"");
        bw.flush();
        bw.close();

    }
}