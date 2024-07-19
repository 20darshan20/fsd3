public class carRental {
    int CarID;
    String CarType;
    float rent;


    void Getcar(int CarID,String CarType){
        this.CarID=CarID;
        this.CarType=CarType;
    }


    void GetRent(){
        if(CarType=="small"){
            rent=1000;
        } else if (CarType=="Van") {
            rent=800;

        }else {
            rent=2500;
        }
    }
    void ShowCar(){
        System.out.println(CarID+" "+CarType+" "+rent);
    }

    public static void main(String[]args){
        carRental obj=new carRental();
        obj.Getcar(80, "Suv");
        obj.GetRent();
        obj.ShowCar();
    }
}
