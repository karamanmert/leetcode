package blind75.longestSubstringWithoutRepeatingCharacters;

/**
 * @author karamanmert
 * @date 16.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcaacmvbcvm")); // 5
        System.out.println(solution.lengthOfLongestSubstring("abcda")); // 4
        System.out.println(solution.lengthOfLongestSubstring("abca")); // 3
        System.out.println(solution.lengthOfLongestSubstring("mskfsdfo")); // 6
    }
}
