package blind75.array.containsDublicate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        // [1,2,3,4,1] true
        // [1,2,3,4] false
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return true;
            }
            list.add(num);
        }
        return false;
    }
}
