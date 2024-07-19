class PersonalDetails{
    String name;
    int password;
    int age;
}
class EmployeeDetails extends PersonalDetails{
    int salary;
    String companyName;
}



public class Singelinheritance {
    public static void main(String []args){
   EmployeeDetails obj1=new EmployeeDetails();
   obj1.name="vikas";
   obj1.password=123;
   obj1.salary=900;
   obj1.companyName="upgrade";
        System.out.println(obj1.name+" "+obj1.password+" "+obj1.age);
    }

}
