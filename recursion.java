public class recursion {
    int a=0;
    int b=1;
   void fun(int x){
       if(x==10)
            return;
       int num=a+b;
       System.out.println(num);
       a=b;
       b=num;
       fun(x+1);
    }

    public static void main(String[] args) {
        recursion obj =new recursion();
          System.out.println(0);
          System.out.println(1);
        obj.fun(1);
    }


}
