package blind75.array.besttimetobuystock;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Solution {

    public int maxProfit(int[] prices) {
        /*
        // {7, 1, 5, 3, 6, 4};
        // [7,6,4,3,1]
        int max = prices[1];
        int maxIndex = 1;

        int min = prices[0];
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (max <= prices[i]) {
                max = prices[i];
                maxIndex = i;
            }
            if (min >= prices[i]) {
                min = prices[i];
                minIndex = i;
            }
        }
        if (maxIndex > minIndex) {
            return max - min;
        }
        else
            return 0;
         */
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // [7,1,5,3,6,4]
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
