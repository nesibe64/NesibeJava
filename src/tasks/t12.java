package tasks;

import java.util.Scanner;

public class t12 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        double max = inp.nextDouble();

        boolean s = !(max%2==0 || max%3==0 |max%4==0 ||max%5==0 ||max%8==0|| max%9==0||max%7==0);
        if(max==1){
            System.out.println("not prime");
        }
        else if(s){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }







    }
}
