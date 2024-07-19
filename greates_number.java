public class greates_number {
    static int Greates_number(int arr1[]) {
        if (arr1[0] > arr1[1] && arr1[0] > arr1[2])
            return arr1[0];
        if (arr1[1] > arr1[0] && arr1[1] > arr1[2])
            return arr1[1];
        return arr1[2];
        }
        public static void main(String[]args){
           int arr[]={90,87,45};
            int num = Greates_number(arr);
            System.out.println(num);

        }
    }


