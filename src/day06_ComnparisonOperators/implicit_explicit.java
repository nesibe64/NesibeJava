package day06_ComnparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;

        long l2 = (long)s1;

        int  I1= 300;
        double D1 =I1;
        System.out.println(D1);

        double d1=400.5555;
        int i1 = (int )d1;
        System.out.println(i1);

        long c1=4400;
        short sh1 = (short)c1;
        System.out.println(sh1);

        double n1 = 1254.5856;
        short b1=(short)n1;
        System.out.println(b1);

        int p1 =1000;
        byte z1=(byte)p1;
        System.out.println(z1);

        double m1 =34.5;
        float f1= (int)m1;
        System.out.println(f1);

        long r1= -500;
        int k1 = (int)r1;
        System.out.println(k1);

        long r2=13;
        byte t2=(byte)r2;
        System.out.println(t2);














    }








}
