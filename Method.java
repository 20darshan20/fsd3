public class Method {
    static void Number(float number1f,float number2f){
     float num3f= number1f;
        number1f=number2f;
        number2f=num3f;
        System.out.println(number1f+" "+number2f);
    }
    public static void main(String[]args){
    Number(10,20);
    }
}