import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] newMarks = new int[n];
        System.out.println("Enter the marks of students");
        for (int i = 0; i < n; i++) {
            int studentsMarks = sc.nextInt();
            newMarks[i] = studentsMarks;

        }
        System.out.println("Marks of student");


        for (int i = 0; i < n; i++) {
            System.out.println(newMarks[i]);

        }


    }
}

