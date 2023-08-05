import java.util.ArrayList;
import java.util.List;
class Solution {
    public static int[] solution(int n, int k) {
        List<Integer> intlist = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                intlist.add(i);
            }
        }
        return intlist.stream().mapToInt(i -> i).toArray();
    }
}