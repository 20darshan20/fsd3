public class array_example {
    public static void main(String[] args) {
        int[] arr = {12, 34, 11, 13, 56, 19};
        int number = arr.length;
        for (int i = 0; i < number; i++) {
            if (arr[i] % 2 == 0) {

                System.out.println(arr[i]);
            }


        }


    }
}
