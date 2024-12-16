package blind75.maximumProductSubarray;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new int[]{1, 2, 3, -3, 4, 5, -3}));
        System.out.println(solution.maxProduct(new int[]{1, 2, 3, -3, 4, 5, 3}));
        System.out.println(solution.maxProduct(new int[]{2, -3, 4, -1}));
        System.out.println(solution.maxProduct(new int[]{0, 2}));
    }
}
