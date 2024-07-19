import java.util.Scanner;

public class whileloop {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int tabel=sc.nextInt();
        int i=0;
        while (i<=10){
            System.out.println(i*tabel);
            i++;
        }
    }
}
