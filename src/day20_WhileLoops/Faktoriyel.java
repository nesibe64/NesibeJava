package day20_WhileLoops;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int n=scan.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
           result  *=i;
            }

        System.out.println(result);
        }









    }

