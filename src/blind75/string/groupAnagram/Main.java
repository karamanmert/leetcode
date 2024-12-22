package blind75.string.groupAnagram;


import java.util.List;

/**
 * @author karamanmert
 * @date 19.12.2024
 */
public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] in = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> lists = solution.groupAnagrams(in);
        System.out.println(lists);
    }
}
