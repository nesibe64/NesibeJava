package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num=100;
        int a=100;

        byte t=100;
        int z=t;

        //Integer z2=t;

        Byte b1=50;
        int n1=b1;

        byte b2=40;
        // Integer n2= b2;

        Double[] arr=new Double[3];
        System.out.println(Arrays.toString(arr));

        int p1= 300;
        Integer p2=p1; //autoboxing

        Integer q1=500;
        int q2=q1;  //unboxing

        //Double r1=300; wrapper class is only dedicated to its primitive
        double r2=300;
        Double r1=r2; //autoboxing

        Long l1=400l;
        long l2=l1; //unboxing

        Float f1=100f;
        Float f2=f1; //

    }
}
