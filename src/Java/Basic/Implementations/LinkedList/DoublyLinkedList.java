package Java.Basic.Implementations.LinkedList;

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        void Node(int d){
            this.data = d;
        }
    }
}
