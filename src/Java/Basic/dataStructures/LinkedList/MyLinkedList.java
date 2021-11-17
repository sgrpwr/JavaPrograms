package Java.Basic.dataStructures.LinkedList;

public class MyLinkedList {

    private static ListNode head;

    static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    void display(ListNode head){
        if(head==null) return;
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList ls = new MyLinkedList();
        /*ls.head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ls.head.next = second;
        second.next = third;
        third.next = fourth;*/

        //for(int i=10; i<=100; i+=10) addFirst(i);
        //for(int i=10; i<=100; i+=10) addLast(i);
        addLast(10);
        ls.display(ls.head);

        findLength();

    }

    private static void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    private static void findLength() {
        if (head==null) System.out.println(0);
        ListNode temp = head;
        int count=0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    private static void addFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
}
