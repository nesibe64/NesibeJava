package day47_Encapsulation;

public class Constructor {

    static {
        System.out.println("static block");
    }

    public Constructor(int a ){
        System.out.println("int arg");
    }

    public Constructor(double a ){
        this(10);  //int arg
        System.out.println("double arg"); //double arg

    }

    public Constructor(String a ){
        System.out.println("String arg");
    }

    public static void main(String[] args) {

       // new Constructor();
        new Constructor(10);
        new Constructor(20.0);
        new Constructor("alo");
    }

}
