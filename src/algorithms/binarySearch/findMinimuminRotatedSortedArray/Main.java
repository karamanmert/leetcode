package algorithms.binarySearch.findMinimuminRotatedSortedArray;


/**
 * @author karamanmert
 */
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        int[] nums2 = {3,4,5,6,7,8,9,0,1,2};
        int min = s.findMin(nums);
        System.out.println(min);
    }
}
