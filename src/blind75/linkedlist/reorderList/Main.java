package blind75.linkedlist.reorderList;

/**
 * @author karamanmert
 * @date 22.12.2024
 */
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        s.reorderList(n);
    }
}
