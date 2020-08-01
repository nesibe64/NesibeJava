package day15_String;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName=input.next();
       // String fullName = firstName.concat( " ".concat(lastName));
        String fullName = firstName+" "+lastName;
        String fullName2= fullName.toUpperCase();


        System.out.println(fullName2);

        System.out.println("=======================");

        String name="MUHTAR";
        String firstCharacter=name.substring(0,1);
        String rest = name.substring(0,name.length());
        name = firstCharacter.toUpperCase()+rest.toLowerCase();
        System.out.println(name);

        System.out.println("==================================");

        String abc = "rAMAZAnn";
        String firstChar = abc.substring(0,1);
        String remaining =abc.substring(1);

        abc = firstChar.toUpperCase()+remaining.toLowerCase();

        System.out.println(abc);
        System.out.println(remaining);




















    }
}
