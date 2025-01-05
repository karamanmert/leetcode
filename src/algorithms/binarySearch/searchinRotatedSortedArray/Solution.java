package algorithms.binarySearch.searchinRotatedSortedArray;

/**
 * @author karamanmert
 */
public class Solution {
    public int search(int[] nums, int target) {
        // nums in asc order => 1,2,3
        // nums are distinct
        // nums is rotated with k -> 1 <= k <= nums.length.
        // For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]

        // return the index of the target...
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[right] >= nums[mid]) { // means the right part is sorted.
                if (target <= nums[right] && target >= nums[mid]) { // means target is between mid and right
                    left = mid + 1;
                } else { // means ok right part is sorted, but my target is not in it. go left.
                    right = mid - 1;
                }
            }

            if (nums[left] < nums[mid]) {// means the left part is sorted
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
