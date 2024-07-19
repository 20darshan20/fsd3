import java.util.Scanner;

public class marks2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();

        if(marks<=100 && marks>=90){
            System.out.println("Grade A");
        } else if (marks<=89 && marks>=80) {
            System.out.println("Grade B");
        } else if (marks<=79 && marks >= 70) {
            System.out.println("Grade C");

        } else if (marks<=69 && marks >= 60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("F");
        }
    }
}
