import java.util.Arrays;

public class SortColor75 {
    public static int[] sortedColors(int nums[]) {
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         count0++;
        //     } else if (nums[i] == 1) {
        //         count1++;
        //     } else {
        //         count2++;
        //     }
        // }

        // for (int i = 0; i < count0; i++) {
        //     nums[i] = 0;
        // }

        // for (int i = count0; i < count0 + count1; i++) {
        //     nums[i] = 1;
        // }

        // for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
        //     nums[i] = 2;
        // }

        // return nums;

        //By using the Dutch national flag algorithma
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0, 1, 2, 0, 2, 0, 2, 0, 1, 0, 2, 0, 1, 2, 1, 0, 1, 0, 2, 0, 1, 2, 0, 1 };
        System.out.println(Arrays.toString(sortedColors(nums)));
    }
}
