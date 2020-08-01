package day16_String;

import java.util.Scanner;

public class Substring_Practices {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next(); //apple
        System.out.println("Enter your second word");
        String word2 = scan.next(); //banana

        String abc = word1.substring(1)+word2.substring(1);
        System.out.println(abc);
        System.out.println("=================================");*/

        String str="I like to drink Pepsi";
        String drink =str.substring(16);
        System.out.println(drink);

        String abc = str.substring(10,15);
        System.out.println(abc);

        String def = str.substring(7,9);
        System.out.println(def);

        String fgt =str.substring(2,6);
        System.out.println(fgt);

        String hyu =str.substring(0,2);
        System.out.println(hyu);























    }
}
