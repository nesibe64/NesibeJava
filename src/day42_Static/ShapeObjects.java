package day42_Static;

public class ShapeObjects {
    static int b=30;
    public static void main(String[] args) {
        // r=25;
        Circle c1=new Circle();
        c1.setInfo(25);

        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());

        System.out.println("=========================");
        System.out.println(c1);
        System.out.println("==========================");
        Circle c2 =new Circle();

        System.out.println(c2);
        System.out.println("=========================");

        Circle c3=new Circle();
        System.out.println(c3);

        int a =100;
        //static int b=100;
        System.out.println(b);




    }
}
