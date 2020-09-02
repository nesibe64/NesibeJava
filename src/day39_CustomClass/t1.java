package day39_CustomClass;

public class t1 {
    //model,brand,year,color,mileage
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;
    public void setInfo(String carBrand,String carModel,int carYear,String carColor,double carMileage,double carPrice){
       //sets the car info
       brand=carBrand;
       mileage=carMileage;
       model=carModel;
       color=carColor;
       year=carYear;
       price=carPrice;
    }
    public void getInfo(){
        //prints the car info
        System.out.println(year+" "+brand+" "+model+", "+color+" , "+mileage+", $"+price);
    }
    public void start(){
        System.out.println(brand+" "+model+" is started.");
    }




}
