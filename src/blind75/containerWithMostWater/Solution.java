package blind75.containerWithMostWater;

/**
 * @author karamanmert
 * @date 16.12.2024
 */
public class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, w * h);
            if (height[left] < height[right]) { // decide which pipe is short? then ignore the short one.
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
