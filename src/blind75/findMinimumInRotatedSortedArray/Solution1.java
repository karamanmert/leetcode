package blind75.findMinimumInRotatedSortedArray;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution1 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else if (nums[mid] < nums[right]) {
                right = mid;
            }
        }
        return nums[left];
    }
}
