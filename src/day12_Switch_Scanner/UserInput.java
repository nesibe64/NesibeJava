package day12_Switch_Scanner;
import java.util.Scanner; //only imports scanner class from java.util
import java.util.*;//imports every thing from java util

public class UserInput {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
       double num1 = input.nextDouble();

        System.out.println("You entered : "+num1);

    }
}
