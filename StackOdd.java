import java.util.Stack;
import java.util.Scanner;

public class StackOdd {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 11; i++) {
            st.push(i);
        }

        while(! st.isEmpty()){
            int a = st.pop();
            if(a % 2 != 0){
                System.out.print(a + " ");
            }

        }
    }
}





