package day39_CustomClass;

public class t2 {
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car();
        Car car3= new Car();

        car1.setInfo("Mercedes","rtx",1990,"white",234455,98765);
        car2.setInfo("BMW","X5",1786,"red",543456,667654);
        car3.setInfo("Jaguar","rfgt",3456,"yellow",54321,6789);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();

        car1.start();
        car2.start();
        car3.start();
    }
}
