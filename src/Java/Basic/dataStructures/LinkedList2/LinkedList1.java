package Java.Basic.dataStructures.LinkedList2;

public class LinkedList1 {

    static ListNode head;

    static class ListNode{
        private final int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    static void printLinkedList(ListNode head){
        if(head==null) return;
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;*/
        for(int i=1; i<=5; i++) addFirst(i);
        printLinkedList(head);
        reverseList();

    }

    private static void reverseList() {
        if(head==null) return;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        printLinkedList(prev);
    }

    private static void add(int index, int value) {
        if(index==1){
            addFirst(value);
        } else {
            ListNode newNode = new ListNode(value);
            int count = 1;
            ListNode temp = head;
            while(count<index-1){
                temp = temp.next;
                count++;
            }
            ListNode next = temp.next;
            temp.next = newNode;
            newNode.next = next;
        }
    }

    private static void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
}
