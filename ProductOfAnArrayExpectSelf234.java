import java.util.Arrays;

public class ProductOfAnArrayExpectSelf234 {
    public static void productOfAnArray(int nums[]) {

        // divideation approch - but in LC divide operator not allowed to solve this problem
        // int totalProduct  = 1;
        // for(int num : nums) {
        //     totalProduct *= num;
        // }

        // int ans[] = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        //     ans[i] = totalProduct / nums[i];
        // }
        // return ans;


        // // Without divide operator
        // int ans [] = new int[nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     int product = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j) {
        //             product *= nums[j];
        //         }
        //     }
        //     ans[i] = product;
            
        // }

        // return ans;

        // Another Optimal Approch;
        //  int prefix[] = new int[nums.length];
        // prefix[0] = 1;
        // for(int i = 1; i < nums.length; i++){
        //     prefix[i] = prefix[i - 1] * nums[i - 1];
        // }

        // int suffix[] = new int[nums.length];
        // suffix[nums.length - 1] = 1;
        // for(int i = nums.length - 2; i >= 0; i--) {
        //     suffix[i] = suffix[i + 1] * nums[i + 1]; 
        // }

        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));

        // int ans[] = new int[nums.length];
        // for(int i = 0; i < nums.length; i++) {
        //     ans[i] = prefix[i] * suffix[i];
        // }

        // System.out.println(Arrays.toString(ans));

        //Now we will reduce the space complexity to O(1);
        // So we will remove the prefix and suffix  array completly

        int ans[] = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }


        System.out.println(Arrays.toString(ans));

        


    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        productOfAnArray(nums);
    }
}