package Tree;
public class Maxelement_Tree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public Node root;
    public static int FindMax(Node node){
        if(node==null)
            return 0;
        int res=node.data;
        int leftside=FindMax(node.left);
        int RightSide=FindMax(node.right);
        if (leftside>res)
           res= leftside;
        if (RightSide>res)
            res=RightSide;
        return res;
    }
    public static void main(String[] args) {git
        Maxelement_Tree Max=new Maxelement_Tree();
        Max.root=new Node(2);
        Max.root.left=new Node(3);
        Max.root.right=new Node(8);
        Max.root.left.left=new Node(7);
        Max.root.left.right=new Node(11);
        Max.root.right.left=new Node(19);
        Max.root.right.right=new Node(20);
        System.out.println("Maximum Element is"+" "+ Max.FindMax(Max.root));
    }
}
