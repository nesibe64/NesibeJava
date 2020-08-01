package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[] names={"Aalia","Nurbiye","Ayse","Nadir","Muhtar"};

        System.out.println(names[1]);
        //System.out.println(names[5]); out of bonds
        System.out.println("======================================");

        for(int i=0;i<=names.length-1;i++){
           if((names[i].startsWith("A"))){
               continue;
           }
            System.out.println(names[i]);
        }

       int [] numbers=new int[5];

        numbers[1]=23;
        numbers[3]=23;

        System.out.println(Arrays.toString(numbers));
        System.out.println("=======================================");


        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int n =scan.nextInt();
        String[] students=new String[n];
        scan.nextLine();

         for(int i=0;i<=students.length-1;i++){
             System.out.println("Enter a name ");
             students[i]= scan.nextLine();
         }

        System.out.println(Arrays.toString(students));







    }
}

