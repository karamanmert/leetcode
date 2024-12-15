package blind75.containsDublicate;

/**
 * @author karamanmert
 * @date 15.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(solution1.containsDuplicate(new int[]{1, 2, 3}));

        Solution1 solution2 = new Solution1();
        System.out.println(solution2.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(solution2.containsDuplicate(new int[]{1, 2, 3}));

        Solution1 solution3 = new Solution1();
        System.out.println(solution3.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(solution3.containsDuplicate(new int[]{1, 2, 3}));
    }
}
