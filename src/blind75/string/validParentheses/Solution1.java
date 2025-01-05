package blind75.string.validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author karamanmert
 * @date 19.12.2024
 */
public class Solution1 {
    // "([)]" fails because we should close the parantheseses like first ] (bec of last [ ) and then ) -> ( [ ] )
    public boolean isValid(String s) {

        if (s.length() % 2 != 0)
            return false;

        Map<Character, Integer> map = new HashMap<>();
        map.put('{', 0);
        map.put('(', 0);
        map.put('[', 0);
        map.put(']', 0);
        map.put('}', 0);
        map.put(')', 0);


        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(map.get(c), 0) + 1);
            }
        }

        if (!Objects.equals(map.get('{'), map.get('}'))) {
            return false;
        } else if (!Objects.equals(map.get('('), map.get(')'))) {
            return false;
        } else return Objects.equals(map.get('['), map.get(']'));
    }
}
