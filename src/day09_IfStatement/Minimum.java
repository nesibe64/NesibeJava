package day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {
        double a =87;
        double b=4.5;
        double c=0.9;
        double min =0;

        boolean aMin =a<b && a<c;
        boolean bMin =aMin==false && b<c;
        boolean cMin =aMin==false && bMin==false;

        if(aMin){
            min=a;
        }
        if(bMin){
            min=b;
        }
        if(cMin){
            min=c;
        }
        System.out.println(min+" is minimum number ");


    }












}
