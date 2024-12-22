package blind75.string.validAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1); // varsa getir 1 arttır yoksa 0 say 1 arttır.
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!charCountMap.containsKey(c))
                return false;

            // değeri 1 azalt
            charCountMap.put(c, charCountMap.get(c) - 1);

            // değer 0 ise mapten sil
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        return charCountMap.isEmpty();

        /*
        if (s.length() != t.length())
            return false;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
         */

        /*
        if (s.length() != t.length())
            return false;
        List<Character> characters = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            characters.add(current);
        }
        for (int i = 0; i < t.length(); i++) {
            char current = t.charAt(i);
            characters2.add(current);
        }
        Collections.sort(characters);
        Collections.sort(characters2);
        return characters.equals(characters2);
         */
    }
}
