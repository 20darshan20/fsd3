package Tree;
class Nodee{
    int data;
    Nodee left;
    Nodee Right;
    Nodee(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}
public class Tree {
    static void preOrder(Nodee Root){
        if(Root==null)
            return;
        System.out.print(Root.data+" ");
        preOrder(Root.left);
        preOrder(Root.Right);
    }
   static int rightmostelment(Node root){
        if(root.right == null){
            return root.data;
        }

        return rightmostelment(root.right);
    }

    static void InOrder(Nodee Root){
        if(Root==null)
            return;
        InOrder(Root.left);
        System.out.print(Root.data+" ");
        InOrder(Root.Right);
    }
    static void PostOrder(Nodee Root){
        if(Root==null)
            return;
        PostOrder(Root.left);
        PostOrder(Root.Right);
        System.out.print(Root.data+" ");
    }
    public static void main(String[] args) {
        Nodee Root = new Nodee(1);
        Root.left = new Nodee(2);
        Root.Right = new Nodee(3);
        Root.left.Right = new Nodee(4);
        Root.left.left = new Nodee(5);
        Root.Right.left = new Nodee(6);
        preOrder(Root);
        System.out.println();
        InOrder(Root);
        System.out.println();
        PostOrder(Root);
        
    }
}
