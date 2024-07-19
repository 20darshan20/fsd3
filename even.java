import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabel = sc.nextInt();
        for (int i = 1; i <= tabel; i++)
        {
            if(i%2==0)
            {

                System.out.println(i+ "");
            }

        }
    }
}
