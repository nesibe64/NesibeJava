package day21_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max =0;
        for(int i=10;i<=15;i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num>max){
                max=num;
            }
        }

        System.out.println("Max number: "+max);


















    }
}
