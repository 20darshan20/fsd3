import java.util.Scanner;

public class vote {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("can vote");

        }
            else{
            System.out.println("cannot vote");
        }
    }
}
