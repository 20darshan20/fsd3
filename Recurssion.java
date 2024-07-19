public class Recurssion {

    void fun(int x){
        if(x==5)
            return;
        fun(x+1);
        System.out.print(x+" ");
    }

    public static void main(String[] args) {
        Recurssion obj=new Recurssion();
        obj.fun(0);
    }
}
