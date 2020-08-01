package day11_NestedIf_Switch;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 5;
        String days = "";
        if (month == 2) {
            days = "28 days";
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = "30 days";
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = "31 days";
        } else {
            days = "invalid";
        }
        System.out.println(days);
    }
}


