package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_Practices2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first number");
          int num = scan.nextInt();
        Scanner scan2 =new Scanner(System.in);
        System.out.println("Enter your second number");
        int num2 = scan2.nextInt();
        int result= num+num2;
        System.out.println(" Sum of those two numbers are : "+result);

    }
}
