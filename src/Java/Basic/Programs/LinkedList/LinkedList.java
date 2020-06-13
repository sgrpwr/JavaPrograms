package Java.Basic.Programs.LinkedList;

public class LinkedList {

    public Students head = null;
    public Students tail = null;

//Add Student Function
    public void addStudents(int data){
        Students newStudents = new Students(data);
        if(head==null){
            head = newStudents;
            tail = newStudents;
        }
        else {
            tail.next = newStudents;
            tail = newStudents;
        }
    }

//Display Function
    public void display(){
        Students current = head;
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        System.out.println("Studentss are: ");
        while (current!=null){
            System.out.println(current.data+"");
            current = current.next;
        }
    }

    //Main Function
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.addStudents(12);
        linkedList.addStudents(423);
        linkedList.addStudents(23);
        linkedList.addStudents(12331);

        linkedList.display();
    }

}
