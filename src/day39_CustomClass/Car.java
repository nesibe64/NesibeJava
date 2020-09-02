package day39_CustomClass;

public class Car {
    /*
    Attributes:
        model,brand,year,color,mileage,VIN..
     */
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;
    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carMileage, double carPrice){
        //sets the car info
        brand = carBrand;
        model = carModel;
        year=carYear;
        color=carColor;
        mileage = carMileage;
        price = carPrice;
    }
    //2012 Toyota Corolla, Red, 10000, $ 45000
    public void getInfo(){
        //prints the car info
        System.out.println(year+" "+brand+" "+model+", "+color+", "+mileage+", $"+price);
    }

    public void start(){
        System.out.println(brand+" "+model+" is started.");
    }
}










