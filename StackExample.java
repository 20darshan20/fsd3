import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(5);
        st.push(8);
        st.push(2);
        st.push(9);
        st.push(3);
        st.push(11);
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty())
        {
            int x = st.pop();

            while(!temp.isEmpty() && temp.peek()>x)
            {
                st.push(temp.pop());
            }
            temp.push(x);
        }
        System.out.println(temp.pop());
    }
}