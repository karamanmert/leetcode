package blind75.linkedlist.linkedListCycle.Solution;

/**
 * @author karamanmert
 * @date 21.12.2024
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        do {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != head);

        return true;
    }
}
