/*
package Java.Basic.Programs.LinkedList;

import Java.Basic.Programs.LinkedList.SinglyLinkedList.ListNode;

public class FindLoopInLinkedList {

    private static boolean findLoop(SinglyLinkedList.ListNode head) {
    	ListNode slow = head;
    	ListNode fast = head;

    	while(fast.next!=null && fast.next.next!=null) {
    		slow = slow.next;
    		fast=  fast.next.next;
    	}
    	return slow == fast;

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for(int i=1; i<10; i++) list.addLast(i);
        ListNode temp = list.head;

        int count = 1;
        while (count < 4)
        {
            temp = temp.next;
            count++;
        }

        // backup the joint point
        ListNode joint_point = temp;

        // traverse remaining nodes
        while (temp.next != null)
            temp = temp.next;

        // joint the last node to k-th element
        if(temp.next!=null) temp.next = joint_point;

        list.print();

        System.out.print(" "+ findLoop(list.head));
        //findLoop(list.head);
    }
}*/
