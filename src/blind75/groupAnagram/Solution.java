package blind75.groupAnagram;

import java.util.*;

/**
 * @author karamanmert
 * @date 19.12.2024
 */
public class Solution {

    //["eat","tea","tan","ate","nat","bat"]
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> stringCountMap = new HashMap<>();

        if (strs.length == 0) {
            return result;
        }

        for (String current : strs) {
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String string = new String(chars);

            List<String> anagramList = stringCountMap.getOrDefault(string, new ArrayList<>());

            anagramList.add(current);

            stringCountMap.put(string, anagramList);
        }

        result.addAll(stringCountMap.values());

        return result;
    }
}
