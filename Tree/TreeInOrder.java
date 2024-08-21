package Tree;
import java.util.LinkedList;
import java.util.Queue;
class Node1{
        int  data;
        Node1 left;
        Node1 right;
        Node1(int data){
            this.data=data;
            left=right=null;
        }
    }
      public class TreeInOrder {
        static void LevelOrde(Node1 root){
            Queue<Node1>qt=new LinkedList<>();
            qt.add(root);
            while (!qt.isEmpty()){
                Node1 temp=qt.poll();
                System.out.print(temp.data+" ");
                if (temp.left!=null)
                    qt.add(temp.left);
                if (temp.right!=null)
                    qt.add(temp.right);
            }
        }
         public static void main(String[] args) {
              Node1 root = new Node1(1);
              root.left = new Node1(2);
              root.right = new Node1(3);
              root.left.right = new Node1(4);
              root.left.left = new Node1(5);
              root.left.left.left=new Node1(9);
              root.right.left = new Node1(6);
              LevelOrde(root);
        }
}
