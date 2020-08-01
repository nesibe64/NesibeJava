package day12_Switch_Scanner;

public class BiggerClass {
    public static void main(String[] args) {
        double n1=134;
        double n2=45;
        double n3=23;
        String result= (n1>n2 && n1>n3) ? " n1 is bigger number" : (n2>n1 && n2>n3) ? " n2 is bigger number" : " n3 is bigger number";
        System.out.println(result);
    }
}
