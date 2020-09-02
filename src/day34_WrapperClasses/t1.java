package day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class t1 {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE,dd/yyyy/MMMM , hh:mm , a");
        LocalDateTime abc=LocalDateTime.of(1996,7,8,17,43,32);
        System.out.println(abc.format(dtf));


    }
}
