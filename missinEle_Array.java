public class missinEle_Array {
    public static void main(String[] args) {
        int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        int[] newarr = new int[arr.length];
        for (int i = 0; i < (arr.length); i++) {
            newarr[i] = -1;
        }
        for (int i = 0; i < (arr.length); i++) {
            if (arr[i] != -1) {
                newarr[arr[i]] = arr[i];
            }

        }
        for (int j = 0; j < newarr.length; j++) {
            System.out.print(newarr[j] + " ");

        }
    }
}
