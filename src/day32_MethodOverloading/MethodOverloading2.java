package day32_MethodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {
        /*
        task
        create a method that can find the addition of two numbers addtion2Numbers
         */
       addition2Numbers(10,20);
       addition3Numbers(10,20,30);
       addition4Numbers(10,20,30,40);

    }
    public static void addition2Numbers(double a,double b){
        System.out.println(a+b);
    }
    public static void addition3Numbers(double a,double b,double c){
        System.out.println(a+b+c);
    }
    public static void addition4Numbers(double a,double b,double c,double d){
        System.out.println(a+b+c+d);
    }
    public static void addition(double a,double b){
        System.out.println(a+b);
    }
    public static void addition(double a, double b,double c){
        System.out.println(a+b+c);
    }
    public static void additon(double a,double b,double c,double d){
        System.out.println(a+b+c+d);
    }// create a method that can combine 2 arrays of integers

    //create a method that can combine 2 arrays of double

    //create a method that can combine 2 arrays of String

    //create a method that can combine 2 arrays of char

}
