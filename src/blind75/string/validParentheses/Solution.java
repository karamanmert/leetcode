package blind75.string.validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * @author karamanmert
 * @date 19.12.2024
 */
public class Solution {

    public boolean isValid(String s) {

        if (s.length() % 2 != 0)
            return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        // ( [ {
        Stack<Character> stack = new Stack<>();

        for (char key : s.toCharArray()) {
            if (map.containsKey(key)) {
                if (stack.isEmpty() || !Objects.equals(stack.pop(), map.get(key)))
                    return false;
            } else {
                stack.push(key);
            }
        }
        return stack.isEmpty();
    }
}
