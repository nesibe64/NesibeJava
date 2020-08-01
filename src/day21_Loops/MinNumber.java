package day21_Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int min=2234;

        for(int i =3; i<=8;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();


            if(num<min){
                min=num;
            }
        }

        System.out.println("Min number is: "+min);












    }
}
