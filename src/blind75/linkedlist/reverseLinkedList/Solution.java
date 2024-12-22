package blind75.linkedlist.reverseLinkedList;

import java.util.Random;

/**
 * @author karamanmert
 * @date 21.12.2024
 */
// 1,2,3,4,5
// 5,4,3,2,1
// head -> 1
// 5.next -> null
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public void show(ListNode node) {
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node.val);
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