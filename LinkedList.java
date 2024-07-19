class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        next=null;
    }
}

public class LinkedList {
    Node head;
    LinkedList(){
        head=null;
    }

    void insetAtTheEnd(int data){
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
        }
    }

    public static void main(String[] args) {
        LinkedList lj=new LinkedList();
        lj.insetAtTheEnd(10);
        lj.insetAtTheEnd(20);
        lj.insetAtTheEnd(50);
        lj.insetAtTheEnd(40);

        lj.printdata();
    }
}
