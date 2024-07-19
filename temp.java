import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp <= 10) {

            System.out.println("skiing");
        } else if (temp<=20 && temp>=10) {
            System.out.println("hiking");

        } else if (temp<=30 && temp>=20) {
            System.out.println("cycling");
        }else{
            System.out.println("swimming");
        }
    }
}