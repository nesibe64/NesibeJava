package day15_String;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();

        String fullName =firstName+" "+lastName;
        char abc= fullName.charAt(1);

        System.out.println(abc);








    }
}
