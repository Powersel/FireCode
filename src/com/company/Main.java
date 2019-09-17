package com.company;

import Level_01.LinkedList.DeleteLastNode_01_005;
import com.company.BaseStructures.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode one =  new ListNode(1);
        ListNode two =  new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;

        ListNode node = DeleteLastNode_01_005.deleteAtTail(one);
        System.out.print(node);
    }
}
