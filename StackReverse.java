import java.util.Stack;
import  java.util.Scanner;
public class StackReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String name=sc.nextLine();
        Stack<Character>st=new Stack<Character>();
        for (int i = 0; i <name.length(); i++) {
            st.push(name.charAt(i));
        }
        String reverseName=" ";
        while (!st.isEmpty()){
            reverseName=reverseName + st.pop();
        }
        System.out.println(reverseName);
    }
}