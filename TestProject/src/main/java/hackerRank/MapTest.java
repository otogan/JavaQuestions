package hackerRank;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        String s = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }
}
