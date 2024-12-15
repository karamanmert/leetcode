package blind75.containsDublicate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution1 {

    public boolean containsDuplicate(int[] nums) {
        // [1,2,3,4,1] true
        // [1,2,3,4] false
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }else
                map.put(num, num);
        }
        return false;
    }
}
