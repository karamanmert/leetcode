package blind75.maximumProductSubarray;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max = nums[0];
        int tempMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tempMax = Math.max(tempMax * nums[i], nums[i]);
            max = Math.max(max, tempMax);
        }
        return max;
    }
}
