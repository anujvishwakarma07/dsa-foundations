import java.util.*;

public class IIISum15 {

    public static List<List<Integer>> threeSum(int nums[]) {

        // Brute force Approch -

        // List<List<Integer>> ans = new ArrayList<>();
        // HashSet<List<Integer>> hs = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // for (int k = j + 1; k < nums.length; k++) {
        // if (nums[i] + nums[j] + nums[k] == 0) {
        // List<Integer> list = new ArrayList<>(Arrays.asList(
        // nums[i],
        // nums[j],
        // nums[k]));

        // Collections.sort(list);

        // if (!hs.contains(list)) {
        // hs.add(list);
        // ans.add(list);

        // }
        // }
        // }
        // }
        // }
        // return ans;

        // //Using set
        // HashSet<List<Integer>> uniqeTriplet = new HashSet<>();
        // for(int i = 0 ; i < nums.length; i++){
        // int target = -nums[i];
        // HashSet<Integer> hs = new HashSet<>();
        // for(int j = i + 1; j < nums.length; j++){
        // int third = target - nums[j];
        // if(hs.contains(third)) {
        // List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j],
        // third));
        // Collections.sort(triplet);
        // uniqeTriplet.add(triplet);
        // }

        // hs.add(nums[j]);

        // }
        // }
        // List<List<Integer>> ans = new ArrayList<>(uniqeTriplet);
        // return ans;

        // using two pointer Approch -- very optimal solution
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(nums[i] , nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j -1]) j++;
                }

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
