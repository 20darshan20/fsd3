import java.util.Scanner;

public class reversString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name1 = sc.nextLine();
        String rev="";
        int n=name1.length();
        for (int i =n-1; i>=0 ; i--) {
            rev= rev+name1.charAt(i);
            
        }
          System.out.println(rev);
        if (name1.equals(rev)){
            System.out.println("Palindorne");
        }else{
            System.out.println("not Palindorne");
            
          }
        }



}
