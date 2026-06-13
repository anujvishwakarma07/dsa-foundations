import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram49 {
    public static List<List<String>> groupAnagram(String strs[]) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String str : strs) {
            int count[] = new int[26];
            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append("#");
                sb.append(i);
            }

            String Key = sb.toString();

            if (!hm.containsKey(Key)) {
                hm.put(Key, new ArrayList<String>());
            }

            hm.get(Key).add(str);
        }

        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagram(strs));
    }
}
