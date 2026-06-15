import java.util.Arrays;

public class twoSumII167 {
    public static int[] findtwoSum(int numbers[], int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(findtwoSum(numbers, target)));
        
    }
}
