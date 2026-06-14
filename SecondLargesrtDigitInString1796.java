import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargesrtDigitInString1796 {
    public static int SecondLargest(String s ) {
        HashSet <Integer> hs = new HashSet<>();
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                hs.add(Character.getNumericValue(ch));
            }
        }

        ArrayList <Integer> list = new ArrayList<>(hs);
        Collections.sort(list);

        if(list.size() < 2) {
            return -1;
        }

        System.out.println(list);

        int ans = list.get(list.size() - 2);

        return ans;

    }
    public static void main(String[] args) {
        String s = "abcbu515921jienfief4815wneu";
        System.out.println(SecondLargest(s));

    }
}
