package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();

        car1.setInfo("Lexus","RX350",2019,"White",14000,45000);
        car2.setInfo("Lexus","RX450",2020,"Black",2000,65000);
        car3.setInfo("Bugatti","Veyron",2018,"Blue",23000,75000);
        car4.setInfo("Ford","Escape",2017,"Silver",150000,12500);
        car5.setInfo("Nissan","GT-R",2019,"Black",5000,95000);


        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car1.start();
        car2.start();
        car5.start();












    }
}
