package day14_Recap;

import java.util.Scanner;

public class nextLIne_next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName=input.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine();

        System.out.println(fullName+" is "+age+" years old.");
    }
}
