package day33_LocalDateTime;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class t1 {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat(("0.00"));
        double a =22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));
        System.out.println(df.format(65.43213456432134578907654321));
        System.out.println("========================");

        LocalDate DOB=LocalDate.of(2030,4,5);
        System.out.println(DOB);

        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate y=LocalDate.of(2042,2,3);
        boolean result=y.isLeapYear();
        System.out.println(result);

        LocalTime t1=LocalTime.of(4,54);
        System.out.println(t1);

        LocalTime now=LocalTime.now();
        System.out.println(now);

        LocalDateTime t2=LocalDateTime.of(1234,5,6,6,34,45);
        System.out.println(t2);

        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("MMMM/dd/yy ,E hh:ss a");
        LocalDateTime t3=LocalDateTime.of(1998,4,5,6,7,9);
        System.out.println(t3.format(dateFormat));

        DateTimeFormatter abc=DateTimeFormatter.ofPattern("EEEE,MMMM/dd/yyyy hh:mm a");
        LocalDateTime t4=LocalDateTime.of(1987,3,5,12,34,45);
        System.out.println(t4.format(abc));
        System.out.println("I was born today");
    }
}
