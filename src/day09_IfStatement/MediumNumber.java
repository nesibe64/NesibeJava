package day09_IfStatement;

public class MediumNumber {
    public static void main(String[] args) {
        double a= 10;
        double b=70;
        double c=123;

        boolean aMed= (a>b && a<c)||(a>c && a<b);
        boolean bMed=(b>a && b<c) ||(b>c && b<a);
        boolean cMed=!aMed && !bMed;

        double med=0;

        if(aMed){
          med=a;
        }

        if(bMed){
            med=b;
        }
        if(cMed){
            med=c;
        }
        System.out.println(med+" is the medium number");









    }












}
