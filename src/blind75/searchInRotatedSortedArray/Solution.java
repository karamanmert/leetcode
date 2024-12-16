package blind75.searchInRotatedSortedArray;

/**
 * @author karamanmert
 * @date 16.12.2024
 */
public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[left]) { // means left part is sorted.
                if (target >= nums[left] && target <= nums[mid]) { // means target in the sorted part
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            if (nums[mid] < nums[right]) { // means right part is sorted
                if (target >= nums[mid] && target <= nums[right]) { // means target in the sorted part
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
