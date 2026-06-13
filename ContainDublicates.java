import java.util.HashSet;

public class ContainDublicates {
    public static boolean ContainDublicate(int nums[]) {
        HashSet <Integer> hs = new HashSet<>();
        for(int num : nums) {
            if(!hs.add(num)) {
                return true;
            }
        }
        // System.out.println(hs);
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,5};
        System.out.println(ContainDublicate(nums));
    }
}
