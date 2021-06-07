package Java.Basic.Programs.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList {
    private static ListNode head;

    class ListNode{
        int data;
        ListNode next;

        ListNode(int i){
            this.data = i;
            this.next = null;
        }
    }

    //Find length of the Linked-List
    public int length(){
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Find Print all the elements in the Linked_List
    public void print(){
        ListNode temp = head;
        if(temp==null) return;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    //Insert at the beginning of a Linked_list
    public void addFirst(int d){
        ListNode newNode = new ListNode(d);
        newNode.next = head;
        head = newNode;
    }

    //Insert at the end of a Linked_list
    public void addLast(int d){
        ListNode newNode = new ListNode(d);
        if(null==head) addFirst(d);
        else{
            ListNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Insert at the given position of a Linked_list
    public void addAtPosition(int d, int p){
        ListNode newNode = new ListNode(d);
        int l = length();
        if(l<p){
            System.out.println("Invalid Position!!");
            return;
        }
        if(null==head) addFirst(d);
        else{
            ListNode prev = head;
            while(--p > 1){
                prev = prev.next;
            }
            ListNode current = prev.next;
            prev.next = newNode;
            newNode.next = current;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        //System.out.println(list.length());
        list.addFirst(8);
        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(9);

        //list.addLast(17);
        //list.addLast(19);

        list.addAtPosition(81,2);
        list.print();
    }
}
