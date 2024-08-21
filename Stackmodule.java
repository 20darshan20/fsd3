import java.util.Scanner;
import java.util.Stack;

public class Stackmodule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        int number= sc.nextInt();
        boolean flag=true;
        for (int i = 0; i<number; i++) {
            st.push(i);
        }
        while (!st.isEmpty()){
            int number2=st.pop();
            if (number==-1){
                st.pop();
            }
        }
    }
}
