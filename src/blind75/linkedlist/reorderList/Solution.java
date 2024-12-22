package blind75.linkedlist.reorderList;

/**
 * @author karamanmert
 * @date 22.12.2024
 */
public class Solution {
    // -> 1, 2, 3, 4 == l0, l1,... ln
    // -> 1, 4, 2, 3 == l0, ln , l1, ln-1 ..
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null)
            return;

        // 1- find the middle
        // when fast reaches end of. slow reaches the middle. so after this step slow will be THE MID.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2- reverse the second part
        ListNode current = slow;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode secondHalf = prev;

        // Step 3: Merge the two halves
        ListNode firstHalf = head;
        while (secondHalf.next != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
