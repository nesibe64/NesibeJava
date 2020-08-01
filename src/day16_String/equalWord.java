package day16_String;

import java.util.Scanner;

public class equalWord {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next();
        System.out.println("Enter your second word");
        String word2= scan.next();

        String result= (word1.equalsIgnoreCase(word2))? "They are equal" : "Not equal";
        System.out.println(result);













    }
}
