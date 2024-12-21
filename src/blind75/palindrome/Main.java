package blind75.palindrome;

/**
 * @author karamanmert
 * @date 10.12.2024
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        DiffSolu solution2 = new DiffSolu();
        String palindrome = "abbebba";
        System.out.println(solution.isPalindrome(palindrome));


        String test1 = "A man, a plan, a canal: Panama!";
        String test2 = "Hello, World!";
        System.out.println(solution2.isPalindrome(test1));
        System.out.println(solution2.isPalindrome(test2));
    }
}
