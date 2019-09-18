package com.company;

import Level_01.LinkedList.DeleteLastNode_01_005;
import Level_01.LinkedList.LinkedListMiddle_01_008;
import Level_01.Strings.FirstUniqueChar_01_005;
import Level_01.Strings.ReplaceAllSpaces_01_007;
import com.company.BaseStructures.ListNode;

public class Main {

    public static void main(String[] args) {
        System.out.print(LinkedListMiddle_01_008.findMiddleNode(simpleList()));
    }

    private static ListNode simpleList() {
            ListNode one = new ListNode(1);
            ListNode two = new ListNode(2);
            ListNode three = new ListNode(3);
            ListNode f = new ListNode(4);
            ListNode ff = new ListNode(5);

            one.next = two;
            two.next = three;
            three.next = f;
            f.next = ff;

       return one;
    }
}
