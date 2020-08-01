package day11_NestedIf_Switch;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month=76;
        boolean validNumber= month>=1 && month<=12;
        boolean days28 = month==2;
        boolean days30= month==4||month==6||month==9||month==11;

        String result="";
        if(validNumber){
            if(days28){
                result ="days28";
            }else if(days30){
                result="days30";
            }else{
                result="days31";
            }



        }else{
            result="Invalid";
        }
        System.out.println(result);






    }
}
