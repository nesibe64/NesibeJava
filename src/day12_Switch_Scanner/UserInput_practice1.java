package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_practice1 {

    public static void main(String[] args) {
        Scanner   scan  =  new Scanner(System.in);
        System.out.println("Enter your number: ");
         double num =   scan.nextDouble();

         String result = (num%2==0) ? "Number is even " : "Number is odd";
        System.out.println(result);






    }
}