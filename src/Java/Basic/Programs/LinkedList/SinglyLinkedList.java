package Java.Basic.Programs.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Check if the Linked-List is empty or not
    public boolean isEmpty(){
        return head == null ? true : false;
    }

    //Length of the Linked-List
    public int length() {
        if (!isEmpty()){
            int count = 0;
            ListNode temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
        return 0;
    }

    //Search an element in a Linked-List
    public boolean search(int data) {
        if (!isEmpty()){
            ListNode temp = head;
            while(null != temp.next){
                if (temp.data == data) return true;
                temp = temp.next;
            }
        }
        return false;
    }

    //Print the Linked-List
    public void print() {
        if (head == null) {
            System.out.println("There are no elements in the Linked list.");
        } else {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }

    //Add at the first position of the Linked-List
    public void addFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //Add at the last position of the Linked-List
    private void addLast(int i) {
        ListNode temp = head;
        if (isEmpty()) addFirst(i);
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            ListNode newNode = new ListNode(i);
            temp.next = newNode;
        }
    }

    //Add at any position of the Linked-List
    private void addAtAny(int data, int pos) {
        if (pos == 0) addFirst(data);
        else if (pos > length()) System.out.println("Invalid Position!");
        else {
            ListNode newNode = new ListNode(data);
            ListNode prev = head;
            ListNode current;
            while (pos-- > 1) {
                prev = prev.next;
            }
            current = prev.next;
            prev.next = newNode;
            newNode.next = current;
        }
    }

    //Delete the first position of the Linked-List
    private void deleteFirst() {
        ListNode temp = head;
        head = head.next;
    }

    //Delete the last position of the Linked-List
    private void deleteLast() {
        if (!isEmpty()){
            ListNode temp = head;
            while (null != temp.next.next) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    //Delete the any position of the Linked-List
    private void deleteAtAny(int pos) {
        if (head == null) System.out.println("The list is already empty!");
        else if (pos == 0) deleteFirst();
        else {
            ListNode prev = head;
            ListNode current;
            while (pos-- > 1) {
                prev = prev.next;
            }
            current = prev.next;
            prev.next = current.next;
        }
    }

    //Middle element of the Linked-List
    public int findMiddle() {
        if (head == null) return -1;
        else {
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next !=null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }

    //Create a loop in a Linked-List
    public void makeLoop(){
        if(head == null) return;
        else {
            ListNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    //Detect a loop in a Linked-list
    public boolean detectLoop(){
        if (null == head) return false;
        else {
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next !=null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast) return true;
            }
        }
        return false;
    }

    //Reverse a Linked-List
    public void reverse(){
        ListNode prev = null;
        if (!isEmpty()){
            ListNode current = head;
            ListNode next = null;
            while(current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
        }
        while (prev!=null){
            System.out.print(prev.data+" ");
            prev = prev.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        for (int i = 0; i <= 10; i++) list.addLast(i);
        list.print();
      /*  list.addFirst(1);
        System.out.println(list.isEmpty());
        list.print();
        list.addLast(2);
        list.print();
        list.addAtAny(3, 3);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteAtAny(0);
        list.print();
        System.out.println(list.length());
        System.out.println(list.findMiddle());
        System.out.println(list.search(5));
        list.reverse();*/
        list.makeLoop();
        System.out.println(list.detectLoop());
    }
}