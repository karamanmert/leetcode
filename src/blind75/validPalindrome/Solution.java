package blind75.validPalindrome;

/**
 * @author karamanmert
 * @date 19.12.2024
 */
public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c))
                sb.append(c);
        }

        String first = sb.toString();

        for (int i = 0; i < first.length() / 2; i++) {
            if (first.charAt(i) != first.charAt(first.length() - 1 - i))
                return false;
        }
        return true;
    }
}
