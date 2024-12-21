package blind75.linkedlist.reverseLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
        ListNode next4 = new ListNode(5);
        head.next = next;
        next.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = null;

        ListNode reverseList = s.reverseList(head);
        s.show(reverseList);
    }
}