package day21_Loops;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=0;
        int b=4;
        if(b==0){
            System.out.println("Invalid input");
            System.exit(0); // forcefully terminating the program
        }

        int count=0;

        while(a>=b){
           a -=b;
           count++;
        }

        System.out.println(count+" with a remainder of "+a);















    }
}
