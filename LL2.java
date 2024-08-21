 public class LL2 {
    //Hello World

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public void Addelement(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
     void printdata() {
         Node first = head;
         while (first!=null) {
             System.out.println(first.data);
            first = first.next;
         }
     }
     public static void main(String[] args) {
         LL2 obj= new LL2();
         obj.Addelement(1);
         obj.Addelement(5);
         obj.Addelement(7);
         obj.Addelement(8);
         obj.Addelement(10);
         obj.printdata();
     }
}

