package blind75.linkedlist.removeNthNodeFromEndofList;

/**
 * @author karamanmert
 * @date 21.12.2024
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null)
            return null;
        // head -> 1,2,3,4,5
        // dummy -> 0,1,2,3,4,5

        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        // fast pointer should go n+1 steps ahead
        // if n = 2, fast -> 3,4,5
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // move both pointers ahead until fast reach to the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
