package day09_IfStatement;

public class Maximum {
    public static void main(String[] args) {
        double a = 100;
        double b = 98;
        double c = 1;

        boolean aMax = a>b && a>c;
        boolean bMax = b>a && b>c;
        boolean cMax = c>a && c>b;
        double max = 0;
        if(aMax){
           // System.out.println(a+" is maximum number");
            max= a;
        }
        if (bMax){
            //System.out.println(b+" is maximum number");
            max=b;
        }
        if(cMax){
            //System.out.println(c+" is maximum number");
            max=c;
        }
        System.out.println(max+" is maximum number");

















    }













}
