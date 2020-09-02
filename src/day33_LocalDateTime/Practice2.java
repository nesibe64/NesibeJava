package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {

        String[] students={"ALi","VEli","Selami","ZEkiye","Asiye"};
        LocalDate[] bithDays={LocalDate.of(1982,3,4),
                LocalDate.of(1996,2,14),
                LocalDate.of(1234,5,7),
                LocalDate.of(1998,3,7),
                LocalDate.of(1678,4,6)
        };

        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE ");

        for(int i=0;i<= students.length-1;i++){
            System.out.println(students[i]+" "+bithDays[i].format(dateFormat));
        }


    }
}
