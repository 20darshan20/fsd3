class PersonalDetails1{
    String name;
    int password;
    int age;
}
class CompanyOffer1 extends PersonalDetails{
    String CompanyName;
    int Salary;
}
class CompanyOffer2 extends PersonalDetails{
    String CompanyName;
    int Salary;
}
public class HiracalInheritance {
    public static void main(String[]args){
        CompanyOffer1 obj1=new CompanyOffer1();
        obj1.name="Darshan";
        obj1.CompanyName="TSC";



        CompanyOffer2 obj2=new CompanyOffer2();
        obj2.name="vikas";
        obj2.CompanyName="upgrade";
        System.out.println(obj1.CompanyName);
    }

}

