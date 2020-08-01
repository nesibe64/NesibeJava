package day11_NestedIf_Switch;

public class NestedIf {
    public static void main(String[] args) {
        int score =76;
        String result="";

        if(score>=0 && score<=100){
           if( score >=90){
               result="A";
           }else if(score>=80){
               result ="B";
           }else if(score>=70){
               result="C";
           }else if(score>=60){
               result="D";
           }else if(score>=50){
               result="E";
           }else {
               result = "F";
           }
           }

        else{
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("====================");

        int num=5;
        String day = "";

        if(num>=1 && num<=7){
           if(num==1){
               day="Monday";
           }else if(num==2){
               day="Tuesday";
           }else if(num==3){
               day="Wednesday";
               day="Thursday";
           }else if(num==5){
               day="Friday";
           }else if(num==6){
               day="Saturday";
           }else{ day="Sunday";
           }
        }else{
            day="Invalid";
        }
         System.out.println(day);





















    }
}
