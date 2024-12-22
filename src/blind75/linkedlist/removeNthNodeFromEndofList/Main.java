package blind75.linkedlist.removeNthNodeFromEndofList;

/**
 * @author karamanmert
 * @date 21.12.2024
 */
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode node = new ListNode(1);
        node.next= new ListNode(2);
        node.next.next= new ListNode(3);
        node.next.next.next= new ListNode(4);
        node.next.next.next.next= new ListNode(5);
        System.out.println(s.removeNthFromEnd(node, 2));
    }
}
