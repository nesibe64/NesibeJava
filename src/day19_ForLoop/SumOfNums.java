package day19_ForLoop;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("ENter a number");
        int num=scan.nextInt();
       /* num=(num*(num+1))/2;     //kendim yaptim:)
        System.out.println(num);*/
        int sum=0;
        if(num>0){
            for(int i=0;i<=num;i++){
                sum +=i;
            }
            System.out.println(sum);
        }else{
            System.out.println("Invalid Entry");
        }











    }
}
