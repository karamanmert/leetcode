package blind75.array.containsDublicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() == nums.length;
    }
}
