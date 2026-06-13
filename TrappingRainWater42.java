import java.util.Arrays;

public class TrappingRainWater42 {
    public static int rainWater(int height[]) {
        int n = height.length;

        // First create the leftMaxBoundries, rightMaxBoundries
        int lmb [] = new int[n];
        int rmb [] = new int[n];

        // calculate  the leftMaxBoundries - 

        //initialize the first boundry as the maximum
        lmb[0] = height[0];
        
        for(int i = 1; i < n; i++){
            lmb[i] = Math.max(height[i], lmb[i - 1]);
        }

        System.out.println(Arrays.toString(lmb));

        // calculate  the rightMaxBoundries - 

         //initialize the first boundry as the maximum
         rmb[n - 1] = height[n - 1];
         
         for(int i = n - 2; i >= 0; i--) {
            rmb[i] = Math.max(height[i], rmb[i + 1]);
         }


        //  Calculate the trappedWater by moving to each hieght
        int trappedWater = 0;
        for(int i = 0 ; i < n ; i ++){
            int waterLevel = Math.min(lmb[i], rmb[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
        





    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(rainWater(height));
    }
}
