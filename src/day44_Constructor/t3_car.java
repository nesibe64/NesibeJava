package day44_Constructor;

public class t3_car {
    String brand;
    String model;
    double price;
    int year;

    public t3_car(String brand,String model,double price,int year){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.year=year;
    }
    public String toString(){
        return "Brand: "+brand+",model: "+model+",price: $"+price;
    }

}
