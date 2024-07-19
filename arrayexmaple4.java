public class arrayexmaple4 {
    public static void main(String[] args) {
        int[] arr = {12, 4, 67, 88, 90};
        int max = arr[0];
        int n=arr.length;

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }
        }
                System.out.println(max);
            }

        }


