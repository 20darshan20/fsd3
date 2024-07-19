import java.lang.reflect.Array;

public class arrayrevers {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3,};
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        int count =0;
        System.out.println(" ");
        for (int i = array1.length - 1; i >= 0; i--) {
            newArray[count]=array1[i];
            count++;
        }
        for (int i = 0; i < newArray.length ; i++) {
            System.out.print(newArray[i]);

        }

    }

}