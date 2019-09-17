package Level_01.LinkedList;
import com.company.BaseStructures.ListNode;

/*
Given a singly-linked list, write a method to delete its last node and return the head.
Example:
1->2->3->4 ==> 1->2->3
 */

public class DeleteLastNode_01_005 {
    public static ListNode deleteAtTail(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;

        while (head.next.next != null) {
            ListNode next = head.next;
            head = next;
        }

        head.next = null;

        return first;
    }
}
