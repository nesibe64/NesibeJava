package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {

    public static void main(String[] args) {
        int a=10;
        double b=23;
        System.out.println(addition(a,b));

        float num1=54;
        float num2=12;
        System.out.println(addition((int)num1,(int)num2));

        System.out.println(addition(10,30.8));

        int[] arr1={4,3,2,1};
        Arrays.sort(arr1);

        char[] arr2={'C','B','F'};
        Arrays.sort(arr2);

        long l1=100;
        long l2=200;
        System.out.println(multiplication((int)l1,(int)l2));
    }

    public static int addition(int a,int b){
        return a+b;
    }

    public static double addition(double a,double b){
        return a+b;
    }

    public static double addition(double a,int b){
        return a+b;
    }

    public static int multiplicaton(int a,int b){
        return a*b;
    }

    public static double multiplication(double a,double b){
        return a*b;
    }
}

