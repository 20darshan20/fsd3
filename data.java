import java.net.DatagramSocket;
import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Days = sc.nextInt();

        switch (Days) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("wrong input enter the number between 1-7");


        }
    }
}
