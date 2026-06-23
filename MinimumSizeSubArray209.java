public class MinimumSizeSubArray209 {
    public static int minimumSubArray(int nums[], int target) {

        int minWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int low = 0;
        int high = 0;
        for(high = 0; high < nums.length; high++){
            currentSum += nums[high];
            while(currentSum >= target) {
                int currentWindow = high - low + 1;
                minWindow = Math.min(minWindow, currentWindow);
                currentSum = currentSum - nums[low];
                low++;
            }

        }
        return minWindow==Integer.MAX_VALUE?0:minWindow;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minimumSubArray(nums, target));
    }
}
