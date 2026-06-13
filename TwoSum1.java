import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

    public static int[] TwoSum(int nums[], int target) {
        int l = 0;
        int r = nums.length - 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (l <= r) {
            if (!hm.containsKey(target - nums[l])) {
                hm.put(nums[l], l);
                l++;
            } else {
                return new int[] { l, hm.get(target - nums[l]) };
            }

            if (!hm.containsKey(target - nums[r])) {
                hm.put(nums[r], r);
                r--;
            } else {
                return new int[] { r, hm.get(target - nums[r]) };
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int nums[] = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(TwoSum(nums, target)));

    }
}