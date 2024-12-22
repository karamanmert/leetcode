package blind75.string.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * @author karamanmert
 * @date 16.12.2024
 */
public class Solution {
    /*
    pencere kaydırma olarak da geçiyor.
    bir string değerin var ve eleman eleman üzerinde gezmek istiyorsun.
    ilkine geldin baktın yok ekledin. i aynı kalacak başlangıcı gösterecek. j ise ilerlediğini tutmak için ve boyut ölçmek için.
     */
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        int j = 0;
        int length = s.length();

        Set<Character> set = new HashSet<>();


        while (j < length) {
            char currentChar = s.charAt(j);

            while (set.contains(currentChar)) {
                set.remove(currentChar);
                i++;
            }

            set.add(currentChar);

            int currentLength = j - i + 1; // they start from the same point.

            if (currentLength >= maxLength) {
                maxLength = currentLength;
            }
            j++;
        }

        return maxLength;
    }
}
