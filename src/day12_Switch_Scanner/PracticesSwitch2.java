package day12_Switch_Scanner;

public class PracticesSwitch2 {
    public static void main(String[] args) {
        int num =98;
        String month ="";

        switch (num){
            case 1 :
                month="January";
                break;
            case 2:
               month ="February";
                break;
            case 3:
                month= "March" ;
                break;
            case 4:
                month="April" ;
                break;
            case 5:
                month ="May";
                break;
            case 6:
                month ="June";
                break;
            case 7:
                month="July";
                break;
            case 8 :
                month ="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month ="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month ="December";
                break;
            default:
                month="Invalid";
        }
        System.out.println(month);



         String productName = "Macbook";

         switch (productName){

             case "galaxy":
                 System.out.println("Samsung");
                break;
             case "Macbook":
             case "Iphone":
                 System.out.println("Apple");
             break;



         }




    }
}
