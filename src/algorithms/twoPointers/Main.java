package algorithms.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author karamanmert
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // -4 -1 -1 0 1 2
        // i,j,k has to be different.
        // sum of num i,j,k must be 0.
        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left <= right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move left and right pointers to skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }

            }
        }
        return result;
    }
}
