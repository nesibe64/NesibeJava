package day12_Switch_Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        int num=6;
        String day ="";

        switch (num){
            case 2:
                day="28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day="30 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day="31 days";
                break;
            default:
                day ="Invalid ";
        }
        System.out.println(day);





    }
}
