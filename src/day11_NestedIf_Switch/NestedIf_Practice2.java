package day11_NestedIf_Switch;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
    int num  =3;
    String day="";

    /*if(num>=1 && num<=6){
        if(num==1){
            month="January";
        }else if (num==2){
            month="February";
        }else if(num==3){
            month="March";
        }else if(num==4){
            month="April";
        }else if(num==5){
            month="May";
        }else if(num==6){
            month="June";
        }*/
        day = (num==1)? "Monday" :(num==2)? "Tuesday" : (num==3) ? "Wednesday" :(num==4) ? "Thursday" :(num==5) ?"Friday" : (num==6)?
                "Saturday" : (num==7)? "Sunday" : "Invalid" ;

        System.out.println(day);






    }
}
