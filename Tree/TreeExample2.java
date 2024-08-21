package Tree;
public class TreeExample2 {
    public static class Nodee {
        int data;
        Nodee left;
        Nodee Right;
        Nodee(int data) {
            this.data = data;
            this.left = null;
            this.Right = null;
        }
    }
    public Nodee root;
    public TreeExample2() {
        root = null;
    }
    public int CalculateSum(Nodee temp) {
        int sum, sumleft, sumright;
        sum = sumleft = sumright = 0;
        if (root == null) {
            System.out.println("tree is empty");
            return 0;
        } else {
            if (temp.left != null)
                sumleft = CalculateSum(temp.left);

            if (temp.Right != null)
                sumright = CalculateSum(temp.Right);
            sum = temp.data + sumleft + sumright;
            return sum;
        }
    }
    public static void main(String[] args) {
        TreeExample2 tb=new TreeExample2();
        tb.root=new Nodee(50);
        tb.root.left=new Nodee(1);
        tb.root.Right=new Nodee(2);
        tb.root.left.Right=new Nodee(3);
        tb.root.left.left=new Nodee(4);
        tb.root.Right.left=new Nodee(9);
        tb.root.Right.Right=new Nodee(0);
        System.out.println("Sum of all nodes in a tree is" + tb.CalculateSum(tb.root));
    }
}




