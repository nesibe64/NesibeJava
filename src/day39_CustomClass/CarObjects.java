package day39_CustomClass;

public class CarObjects {


    public static void main(String[] args) {
        Car car1 = new Car();
        //classname   object name     keyword   constructor
              /*car1.brand = "Toyota";
              car1.model = "Corolla";
              car1.year = 2020;
              car1.color = "White";
              car1.mileage = 20245.23;
              car1.price = 18500.50;*/
        car1.setInfo("Toyota", "Corolla", 2020, "White", 20_200, 18_150);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.price);
        System.out.println("==============================");
        Car car2 = new Car();
             /* car2.brand="Mercedes";
              car2.model="G 550";
              car2.year = 2000;
              car2.color ="Black";
              car2.mileage=85400;
              car2.price=32300;*/
        car2.setInfo("BMW", "M3", 2019, "Red", 53500, 35255.50);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);
        Car car3 = new Car();
        car3.setInfo("Audi", "A7", 2017, "White", 32000, 36000);
        Car car4 = new Car();
        car4.setInfo("Jeep", "Wrangler", 2018, "Blue", 36_450, 29_999);
        car3.getInfo();
        System.out.println("======================");
        car4.getInfo();
    }
}
