import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class IVSum18 {
    public static List<List<Integer>> fourSum(int nums[], int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length;) {
                int p = j + 1;
                int q = n - 1;
                while (p < q) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p] + (long) nums[q];
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                        while (p < q && nums[p] == nums[p - 1])
                            p++;
                    }
                }
                j++;
                while (p < q && nums[j] == nums[j - 1])
                    j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 2, 2, 2 };
        int target = 8;
        System.out.println(fourSum(nums, target));
    }
}
