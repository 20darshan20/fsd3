import java.util.Scanner;
import java.util.Stack;

public class StackreverseAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        String Rev=" ";
        String str= sc.nextLine();
        Stack<Character>st=new Stack<Character>();
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)!=+' '){
                st.push(str.charAt(i));
            }else {
                while (!st.isEmpty()){
                    Rev=Rev+st.pop();
                }
            }
            Rev=Rev+' ' ;
        }
        while (!st.isEmpty()){
            Rev=Rev+st.pop();
        }
        System.out.println(Rev.trim());
    }
}

