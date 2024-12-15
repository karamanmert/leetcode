package blind75.findMinimumInRotatedSortedArray;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution {
    public int findMin(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                res = nums[i + 1];
                break;
            }
        }
        return res;
    }
    // o(n) çözüm bu bize o(logn) lazım.
}