package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI;//global variable

    public double area;
    public double perimeter;

    static {
        PI=3.14;
    }


     Circle(double radius){
        this.radius=radius;
        diameter =radius*2;
        area=calculatedArea();
        perimeter=calculatePerimeter();

    }
    private double calculatedArea(){
        return radius*radius*PI;
    }
   //for internal use only


    private double calculatePerimeter(){
        return diameter*PI;
    }
    //for internal use only thats why we made it private






}
