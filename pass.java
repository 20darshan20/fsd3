import javax.swing.*;
import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User ID");
        int userid = sc.nextInt();
        int password = sc.nextInt();

        if (userid == 123) {
            if (password == 321) {
                System.out.println("login");
            } else {
                System.out.println(" password is wrong");
            }
        }else{
            System.out.println("wrong user id");
        }
        }
}








