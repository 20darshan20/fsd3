import javax.imageio.stream.ImageInputStream;

public class SUPPLY {
    int code;
     String FoodName;
     String  Sticker;
     String Foodtype;

     void Gettype() {
         if (Sticker == "Green") {
             Foodtype = "vegetarian";
         } else if (Sticker == "Yellow") {
             Foodtype = "Contains Egg";

         } else {
             Foodtype = "Non Vegetarian";
         }
     }
         void FoodIn(int code,String FoodName,String Sticker) {
             this.code=code;
             this.Sticker=Sticker;
             this.FoodName=FoodName;
             Gettype();

        }
        void FoodOut(){
            System.out.println(code+" "+Foodtype+" "+Sticker);
        }


    public static void main(String[] args) {
        SUPPLY obj=new SUPPLY();
        obj.FoodIn(21,"panner","Yellow");
        obj.FoodOut();
     }


}

