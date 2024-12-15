package blind75.lengthOfLastWords;

/**
 * @author karamanmert
 * @date 3.12.2024
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int index = 0;
        int x = 0;
        //"hello world"
        //" hello world"
        //"hellloo asdas as"
        // "   fly me   to   the moon  "
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = i;
            }
            if (!(s.charAt(i) == ' ')) {
                x ++ ;
            }
        }
        if (index == 0) {
            return s.length();
        } else {
            String trimmed = s.substring(index).trim();
            return trimmed.length();
        }
    }
}
