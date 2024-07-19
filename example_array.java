import java.util.Scanner;

public class example_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,};
        int n = arr.length;
        int a = sc.nextInt();

        for (int j = 0; j < a; j++) {
            int temp = arr[0];


            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];

            }

            arr[n - 1] = temp;

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");

            }


        }
    }
}
