class Node2{
    int data;
    Node next;
    Node2 (int data){
        this.data=data;
        next=null;
    }
}

public class LinkedListAddFront {
    Node head;
    LinkedListAddFront(){
        head=null;
    }
    void  insertAtTheBeg2(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insetAtTheEnd (int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    void printdata(){

        Node last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;

            System.out.println("50 number found");

        }
    }

    public static void main(String[] args) {
        LinkedListAddFront lj=new LinkedListAddFront();
        lj.insetAtTheEnd(10);
        lj.insetAtTheEnd(20);
        lj.insetAtTheEnd(50);
        lj.insetAtTheEnd(40);
        lj.insetAtTheEnd(2);
        lj.insertAtTheBeg2(100);
        lj.printdata();

    }
}
