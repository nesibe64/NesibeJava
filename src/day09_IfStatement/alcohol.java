package day09_IfStatement;

public class alcohol {
    public static void main(String[] args) {
        int age =98;
        boolean hasID = true;
        boolean eligible = age>=21 && hasID ;
        String result ="";
        if(eligible==true ){

            //System.out.println("Eligible to buy  alcohol");
            result = "Eligible to buy alcohol";
        }
        if(eligible==false){
           // System.out.println("you buy your milk");
            result = "You are not old enough to buy alcohol";
        }
        System.out.println(result);



















    }















}








