package algorithms.binarySearch.findMinimuminRotatedSortedArray;

/**
 * @author karamanmert
 */
public class Solution {

    public int findMin(int[] nums) {
        // it accepts the solution only if complexity is O(log n)

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[left] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left];



        /*
        // two pointers
        int result = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int min = Math.min(nums[left], nums[right]);
            result = Math.min(min, result);
            left++;
            right--;
        }

        return result;
         */

        /*
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
         */

        /*
        Arrays.sort(nums);
        return nums[0];
         */
    }
}
