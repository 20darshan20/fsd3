public class array2 {
    public static void main(String[]args){
      int[]marks={640,720,550,750,185,900,70,98};
      int noOfstudent=marks.length;
      marks[3]=400;
        for (int i = 0; i <noOfstudent ; i++) {
            System.out.println(i+1+" "+marks[i]);
        }
        System.out.println("Deleting the second element");
        for (int i = 2; i <noOfstudent-1 ; i++) {
            marks[i]=marks[i+1];

        }
        for (int i = 0; i <noOfstudent-1 ; i++) {
            System.out.println((i+1)+" "+ marks[i]);

        }
    }
}
