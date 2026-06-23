public class ContaineraWithMostWater11 {
    public static int mostWater(int height[]) {
        int mostFilledWater = Integer.MIN_VALUE;
        if(height.length < 2) return -1;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int water = minHeight * width;
                if (mostFilledWater < water) {
                    mostFilledWater = water;
                }
            }
        }
        return mostFilledWater;
    }

    public static void main(String[] args) {
        int height[] = { 1};
        System.out.println(mostWater(height));
    }
}