import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargestInArray {

    public static int secondLargest(int nums[]) {

        HashSet <Integer> hs = new HashSet<>();
        for(int num : nums) {
            hs.add(num);
        }

        ArrayList <Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        System.out.println(list);

        if(list.size() < 2) {
            return -1;
        }

        int ans = list.get(list.size() - 2);

        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {10, 5, 10};
        System.out.println(secondLargest(nums));

    }
}
