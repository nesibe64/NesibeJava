package tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if(num>0){
            System.out.println(num+" is positive");

        }else{
            System.out.println(num+" is negative");
        }
    }
}
