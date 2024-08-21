package BST;



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
    public class BStTRee{
        Nodee root;
        BStTRee(){
            root=null;
        }
        void insertbinarydata(int key){
            insertdata(root,key);
        }
        static Nodee insertdata(Nodee root, int key) {
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

        public static void main(String[] args) {

            BStTRee rt=new BStTRee();
            insertdata(rt.root,10);
            rt.insertbinarydata(7);
            rt.insertbinarydata(12);
            rt.insertbinarydata(2);
            rt.insertbinarydata(11);
            rt.insertbinarydata(8);
            rt.insertbinarydata(1);
            rt.insertbinarydata(13);
        }
    }

