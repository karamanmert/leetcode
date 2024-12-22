package blind75.others.recursion;

/**
 * @author karamanmert
 * @date 16.12.2024
 */
public class Main {

    public static void main(String[] args) {
        // 5! = 5.4.3.2.1 = 120
        int result = recursion(5);
        System.out.println(result);
    }

    public static int recursion(int n) {
        if (n == 0) return 1;
        return n * recursion(n - 1);
    }
}
