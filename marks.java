import java.util.Scanner;

public class marks {

    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks<=100 && marks >= 91){
            System.out.println(" Grade is A+");
        }

        else if(marks>=90 && marks >= 81 ){

            System.out.println("Grade is A");
        }
        else if (marks>=80 && marks >= 71 ){
            System.out.println("Grade is B+");
        } else if (marks>70 && marks >= 61) {
            System.out.println("Grade is B");
        } else if (marks>60 && marks >= 40) {
            System.out.println("Grade is c+");
        } else{
            System.out.println("Fail");
        }
    }

    }
