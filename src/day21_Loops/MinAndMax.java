package day21_Loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int max=-214745678;
        int min=34567899;

        for(int i=1;i<=5;i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();

            if(max < num){
              max=num;

            }
            if(min> num){
               min=num;

            }


        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);


















    }
}
