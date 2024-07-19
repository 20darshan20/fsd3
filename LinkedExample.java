class Node5{
    int data;
    Node next;

    Node5(int data){
        this.data=data;
        next=null;
    }
}
public class LinkedExample {
    Node head;

    LinkedExample() {
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

    void printData() {
        if (LoopDetect() == false) {
            Node last = head;
            while (last != null) {
                System.out.print(last.data + " ");
                last = last.next;
            }
        } else {
            System.out.println("there is loop");
        }

    }

    boolean LoopDetect() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            flag = true;
            break;
          }
        }
        return flag;
    }
    public static void main(String[] args) {
        LinkedExample obj= new LinkedExample();
        obj.InsertAtTheEnd(10);
        obj.InsertAtTheEnd(20);
        obj.InsertAtTheEnd(30);
        obj.insertAtTheBeg(5);
        obj.insertAtTheBeg(1);

        Node nodeAdr=obj.head.next.next.next;
        obj.insertAtAnyPoint(nodeAdr,25);
        Node adr=obj.head.next.next.next;
        adr.next=obj.head.next;
       // obj.printData();
        boolean Loopdetect= obj.LoopDetect();
        System.out.println(Loopdetect);
    }
}
