package day16_String;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you employeed?");
        String answer=scan.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }

        String str="I like to learn java programing language";

        System.out.println(str.contains("python"));//false
        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("Java")); //false

        String s1= "Nesibe";
        System.out.println(s1.startsWith("n"));//false
        System.out.println(s1.startsWith("Ne"));//true

        System.out.println(s1.toLowerCase().contains("ne"));
                            //nesibe.contains("ne")
                             //true










    }
}

