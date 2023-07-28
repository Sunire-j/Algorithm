class Solution {
    public int solution(int n, String control) {

        int answer = n;
        answer += (int) control.chars().filter(i->String.valueOf((char)i).equals("w")).count();
        answer -= (int) control.chars().filter(i->String.valueOf((char)i).equals("s")).count();
        answer += 10*(int) control.chars().filter(i->String.valueOf((char)i).equals("d")).count();
        answer -= 10*(int) control.chars().filter(i->String.valueOf((char)i).equals("a")).count();
        return answer;
    }
}