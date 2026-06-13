import java.util.Arrays;

public class ValidAnagram242 {

    public static boolean validAnagram(String s, String t) {
        // Use a frequency array initialized with zeros.
        int count [] = new int[128];

        // For each character in s, increase its frequency.
        // Example: for 'a', index is ('a' - 'a') = 0.
        for(char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }


        // For each character in t, decrease its frequency.
        // If s and t are anagrams, all frequencies should return to zero.
        for(char ch : t.toCharArray()) {
            count[ch -  'a']--;
        }


        // If every element is zero, both strings have matching character counts.
        boolean isAllZero = Arrays.stream(count).allMatch(element -> element == 0);

        return isAllZero;
    }
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        System.out.println(validAnagram(s, t));
    }
}