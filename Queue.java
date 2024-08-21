package String;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}
public class Queue {
    Node head;

    Queue(){
        head=null;
    }

    void InsertAtTheEnd(int Data){
        Node NewNode=new Node(Data);
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

    void PrintData(){
        Node last=head;
        while (last!= null) {
            System.out.print(last.data+" ");
            last = last.next;
        }

    }

    void rotate(int k)
    {
        if (k == 0)
            return;

        Node node = head;
        int count = 1;
        while (count < k && node != null) {
            node = node.next;
            count++;
        }


        if (node == null)
            return;


        Node KNode = node;


        while (node.next != null)
            node = node.next;
        node.next = head;
        head = KNode.next;
        KNode.next = null;
    }
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.InsertAtTheEnd(10);
        obj.InsertAtTheEnd(20);
        obj.InsertAtTheEnd(30);
        obj.InsertAtTheEnd(40);
        obj.InsertAtTheEnd(50);
        obj.InsertAtTheEnd(60);
        obj.rotate(3);
        obj.PrintData();


    }
}