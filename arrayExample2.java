import java.util.Scanner;

public class arrayExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {12, 55, 18, 23,};
        int num = arr.length;
        int a = sc.nextInt();
        for (int i = 0; i < num; i++) {


            if (arr[i] == a) {

                System.out.println(a + " Element Found");
                break;
            } else {

                System.out.println("Element not Found");
                break;
            }

        }
    }
}


