public class substring {
    public static void main(String[] args) {
        String str="xyz";
        int len=str.length();
        int n=(len*(len+1))/2;
        String strarr[]=new String[n];
        int k=0;
        for (int i = 0; i < str.length() ; i++) {
            for (int j = 1; j <str.length() ; j++) {
                strarr[k]=str.substring(i,j+1);
                k++;
                
            }

        }
        for (int i = 0; i <n ; i++) {
            System.out.print(strarr[i]+" ");

            
        }

    }
}
