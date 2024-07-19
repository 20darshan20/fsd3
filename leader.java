public class leader {
    public static void main(String[]args){
        int arr[]={16,17,4,3,5,2};
        int ans[]=new int[arr.length];
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            boolean flag=true;
            for (int j = i+1; j < ans.length ; j++) {
                if (arr[i]>arr[j]){
                    flag=true;

                }else {
                    flag=false;
                    break;


                }

            }
            if (flag){
                ans[count]=arr[i];
                count++;
            }

        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");

        }
    }
}
