package blind75.besttimetobuystock;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices));
    }
}
