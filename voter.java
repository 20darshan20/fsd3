public class voter {
    public static void main(String[] args) {
        int age = 6;
        boolean indian = true;
        boolean voter = true;


        if (age >= 18){
           if(indian==true){
               if(voter==true){

                   System.out.println("you can vote");
               }else{
                    System.out.println("you don`t have voter card");
               }

           }else{
               System.out.println("your are not a indian");
           }
        }else {
            System.out.println("your age is less than 18");
        }

    }
}