package Trees;
import java.util.*;
class Nodee{
    public Nodee right;
    int data;
    Nodee left;
    Nodee Right;
    Nodee(int data){
        this.data=data;
        this.left=null;
        this.Right=null;
    }
}
public class BulidBstInclass {
    Nodee root;
    BulidBstInclass(){
        root=null;
    }
    void insertbinarydata(int key){
       root= insertdata(root,key);
    }
    public static  Nodee insertdata(Nodee root, int key) {
        if (root == null) {
            root = new Nodee(key);
            return root;
        }
        if(key < root.data) {
            root.left = insertdata(root.left, key);
        } else {
            root.right = insertdata(root.Right, key);
        }
        return root;
    }
    //Find LCA In BST Tree
    int  LCA(Nodee root,int key1,int key2){
        if (root==null)
            return -1;
        if (key1<root.data && key2< root.data)
            LCA(root.left,key1,key2);
        if (key1 > root.data && key2 > root.data)
            LCA(root.right,key1,key2);
        return root.data;
    }
    public static void main(String[] args) {
        BulidBstInclass rt=new BulidBstInclass();
        rt.root=new Nodee(10);
        rt.root.left=new Nodee(7);
        rt.root.right=new Nodee(12);
        rt.root.left.left=new Nodee(2);
        rt.root.left.right=new Nodee(8);
        rt.root.right.left=new Nodee(11);
        rt.root.right.right=new Nodee(13);
        rt.root.left.left.left=new Nodee(1);



//        rt.insertbinarydata(7);
//        rt.insertbinarydata(12);
//        rt.insertbinarydata(2);
//        rt.insertbinarydata(11);
//        rt.insertbinarydata(8);
//        rt.insertbinarydata(1);
//        rt.insertbinarydata(13);

//
//        int lca= rt.LCA(rt.root, 2 ,13);
//        System.out.println(lca);
    }
}