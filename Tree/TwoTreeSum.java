package Tree;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class TwoTreeSum {
    static boolean equal(Node t1,Node t2){
        if (t1==null || t2==null)
            return true;

        if (t1.data!=t2.data)
            return false;

        if (t1==null || t2==null)
            return false;

        return equal(t1.left,t2.left) && equal(t1.right,t2.right);
    }

    static int Height(Node root){
        if(root==null)
            return -1;
        int lHeight=Height(root.left);
        int rHeight=Height(root.right);
        return 1+Math.max(lHeight,rHeight);

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);

        Node root1 =new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);
        root1.right.right=new Node(5);

        System.out.println(equal(root,root1));

    }
}
