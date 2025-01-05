package algorithms.binarySearch.searchinRotatedSortedArray;

/**
 * @author karamanmert
 */
public class Main {
    public static void main(String[] args) {
        int [] nums = {0, 1, 2, 4, 5, 6, 7};
        int target = 1;

        Solution s = new Solution();
        int search = s.search(nums, target);
        System.out.println(search);
    }
}
