package algorithms.binarySearch;

/**
 * @author karamanmert
 * It is used to find an element (or index of the element) in a sorted array.
 * O(logn) -> log 2 based. because we divide the array while we're trying to find an element.
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {5, 15, 25, 35, 55, 100, 123, 1231};
        int target = 123;
        Solution solution = new Solution();
        int result = solution.binarySearch(nums, target);
        System.out.println(result);
    }
}

/**
 * How to implement?
 * You have two pointers.
 * Left will hold the beginning of the array.
 * Right will hold the end of the array.
 * Find the middle element in the array.
 * Check the target value. If the target is greater than the middle value, move the left pointer to the right side of the middle value.
 * If mid > target, do the opposite.
 * Then recalculate middle value.
 * Return the INDEX of the target located position.
 * Or return the value's existence.
 */
class Solution {

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
