package day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {
        double angle1 = 120;
        double angle2 = 60;
        double angle3 = 20;

        boolean valid = angle1+angle2+angle3 ==180 ;
        boolean invalid =!valid ;
        if (valid==true ){
            System.out.println("Valid  triangle");
        }
         if (invalid){
             System.out.println("Invalid Triangle");
         }









    }








}
