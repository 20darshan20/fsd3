class Node3{
    int data;
    Node next;

    Node3(int data){
        this.data=data;
        next=null;
    }
}
public class lenghtLinkedLIst {
    Node head;

    lenghtLinkedLIst() {
        head = null;
    }

    void insertAtTheBeg(int data) {

        Node NewNode = new Node(data);
        NewNode.next = head;
        head = NewNode;
    }

    void insertAtAnyPoint(Node pre, int data) {
        if (pre.next == null) {
            return;
        }
        Node NewNode = new Node(data);
        NewNode.next = pre.next;
        pre.next = NewNode;
    }

    void InsertAtTheEnd(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = NewNode;
    }

    int Len() {
        Node last = head;
        int count = 0;
        while (last != null) {
            count++;
            last = last.next;
        }
        return count;
    }

    void printData() {
        Node last = head;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }

    }

    int MiddelElement() {
        int Lenlink = Len() % 2;
        int count = 0;
        Node last = head;
        while (last != null && count != Lenlink) {
            last = last.next;
            count++;
        }
        return last.data;
    }
    public static void main(String[] args) {
        lenghtLinkedLIst obj=new lenghtLinkedLIst();
        obj.InsertAtTheEnd(10);
        obj.InsertAtTheEnd(20);
        obj.InsertAtTheEnd(30);
        obj.insertAtTheBeg(5);
        obj.insertAtTheBeg(1);

        Node nodeAdr=obj.head.next.next.next;
        obj.insertAtAnyPoint(nodeAdr,25);
        int ljLen=obj.Len();
        System.out.println(" Length of a LinkedList "+ljLen);
        obj.printData();
    }
}
