package Level_01.LinkedList;
import com.company.BaseStructures.ListNode;

/*
Given a Singly-Linked List, write a method - findMiddleNode that finds and returns
the middle node of the list in a single pass.

Examples:
1 ==> 1
1->2 ==> 1
1->2->3->4 ==> 2
1->2->3->4->5 ==> 3
 */


public class LinkedListMiddle_01_008 {

    public static ListNode findMiddleNode(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while(fastPointer != null && fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}
