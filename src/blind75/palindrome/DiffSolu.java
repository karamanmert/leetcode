package blind75.palindrome;

/**
 * @author karamanmert
 * @date 18.12.2024
 */
public class DiffSolu {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isLetterOrDigit(current))
                sb.append(Character.toLowerCase(current));
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();

        return s1.equals(s2);
    }
}
