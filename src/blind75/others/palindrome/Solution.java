package blind75.others.palindrome;

/**
 * @author karamanmert
 * @date 10.12.2024
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
