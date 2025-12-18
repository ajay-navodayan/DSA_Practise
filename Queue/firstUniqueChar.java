import java.util.*;

public class firstUniqueChar {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = s.length();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < l; i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        firstUniqueChar obj = new firstUniqueChar();
        String s = "leetcode";
        System.out.println(obj.firstUniqChar(s));
    }
}

