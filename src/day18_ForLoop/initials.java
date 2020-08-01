package day18_ForLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName=scan.next();
        String lastName=scan.next();

        System.out.println(firstName);
        System.out.println(lastName);

        String initial1 = firstName.substring(0,1)+"."+lastName.substring(0,1);
        String initial2 =initial1.toUpperCase();

        System.out.println(initial2);

        char ch1=firstName.charAt(0);
        char ch2=lastName.charAt(0);

        String initial=""+ch1+"."+ch2;
               initial=initial.toUpperCase();

        System.out.println(initial);











    }
}
