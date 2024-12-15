package blind75.threeSum;

import java.util.List;

/**
 * @author karamanmert
 * @date 5.12.2024
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }
}
