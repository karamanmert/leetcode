package blind75.linkedlist.mergeTwoSortedLists;

/**
 * @author karamanmert
 * @date 21.12.2024
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(4);

        ListNode second = new ListNode(1);
        second.next = new ListNode(3);
        second.next.next=new ListNode(4);

        ListNode listNode = s.mergeTwoLists(first, second);
        while (listNode.next !=null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }
}
