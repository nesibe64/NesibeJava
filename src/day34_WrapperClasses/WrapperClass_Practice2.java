package day34_WrapperClasses;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        int a=Integer.MAX_VALUE;
        System.out.println(a);

        byte b=Byte.MAX_VALUE;
        System.out.println(b);

        int a2=Integer.MIN_VALUE;
        System.out.println(a2);

        long a3=Long.MAX_VALUE;
        System.out.println(a3);

        long a4=Long.MIN_VALUE;
        System.out.println(a4);

        float a5=Float.MIN_VALUE;
        System.out.println(a5);

        double a6=Double.MAX_VALUE;
        System.out.println(a6);
        System.out.println("=====================");

        Scanner scan=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<=5;i++){
            System.out.println("Enter a number");
            int n=scan.nextInt();

            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
    }
}
