import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {
    public static int[][] mergeInterval(int intervals[][]) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        for(int[] interval : intervals) {
            if(ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);

    }
    public static void main(String[] args) {
        int intervals [][] = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = mergeInterval(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}
