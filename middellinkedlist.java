class Node1{
    int data;
    Node next;

    Node1(int data){
        this.data=data;
        next=null;
    }
}
public class middellinkedlist {
    Node head;
    middellinkedlist(){
        head=null;
    }
    void insertAtTheBeg(int data){

        Node NewNode=new Node(data);
        NewNode.next=head;
        head=NewNode;
    }

    void insertAtAnyPoint(Node pre,int data){
        if(pre.next==null){
            return;
        }
        Node NewNode=new Node(data);
        NewNode.next=pre.next;
        pre.next=NewNode;
    }

    void InsertAtTheEnd(int data){
        Node NewNode=new Node(data);
        if (head==null){
            head=NewNode;
            return;
        }
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=NewNode;
    }
    void printData() {
        Node last=head;
        while (last!= null) {
            System.out.print(last.data+" ");
            last = last.next;
        }

    }
    public static void main(String[] args) {
        middellinkedlist obj=new middellinkedlist();
        obj.InsertAtTheEnd(10);
        obj.InsertAtTheEnd(20);
        obj.InsertAtTheEnd(30);
        obj.insertAtTheBeg(5);
        obj.insertAtTheBeg(1);

        Node nodeAdr=obj.head.next.next.next;
        obj.insertAtAnyPoint(nodeAdr,25);
        obj.printData();
    }
}
