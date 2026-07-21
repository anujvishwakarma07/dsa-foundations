import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CheckifGridcanbeCutintoSections3394
 */

public class CheckifGridcanbeCutintoSections3394 {
    public static int[][] mergeInterval(int intervals[][]) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);

    }

    public static boolean checkValidCuts(int n, int[][] rectangles) {
        int[][] xAxis = new int[rectangles.length][2];
        int[][] yAxis = new int[rectangles.length][2];

        for (int i = 0; i < rectangles.length; i++) {
            xAxis[i][0] = rectangles[i][0];
            xAxis[i][1] = rectangles[i][2];

            yAxis[i][0] = rectangles[i][1];
            yAxis[i][1] = rectangles[i][3];
        }

        int[][] result1 = mergeInterval(xAxis);
        int[][] result2 = mergeInterval(yAxis);

        return result1.length >= n || result2.length >= n;

    }

    public static void main(String[] args) {
        int rectangles[][] = { { 1, 0, 5, 2 }, { 0, 2, 2, 4 }, { 3, 2, 5, 3 }, { 0, 4, 4, 5 } };
        int n = 4;
        System.out.println(checkValidCuts(n, rectangles));

    }
}