package day42_Static;

public class Circle {

    double radius; //r
    double diameter;  // R
    static double pi= 3.14;

    public void setInfo(double radius){
        this.radius =radius;
        diameter = radius*2;

    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return  diameter*2;
    }


    public String toString(){
        return "Radius: "+radius+"\nDiameter: "+diameter+"\nArea: "+calcArea()+"\nPerimeter: "+calcPerimeter();
    }
}
