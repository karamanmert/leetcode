package blind75.twoSum;

/**
 * @author karamanmert
 * @date 5.12.2024
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        System.out.println(ints[0] + " " + ints[1]);
    }
}
