import java.util.Scanner;

public class library {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int day= sc.nextInt();
        if(day<=7){
            System.out.println("there is no fine");
        } else if (day>=8 && day<= 30) {
            System.out.println("the fine is $1.00 per day");

        }else {
            System.out.println("the fine is $2.00 per day");
        }
    }
}
