package blind75.findMinimumInRotatedSortedArray;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution1 solution1 = new Solution1();
        System.out.println(solution.findMin(new int[]{4,5,6,7,8,9,1,2,3}));
        System.out.println(solution1.findMin(new int[]{4,5,6,7,8,9,1,2,3}));
    }
}
