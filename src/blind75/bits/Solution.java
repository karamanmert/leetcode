package blind75.bits;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                result = nums[i + 1];
                break;
            }
        }
        return result - 1;
    }
}