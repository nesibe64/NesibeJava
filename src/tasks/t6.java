package tasks;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();

        if(end>0){
            for(int i=0;i<end*2;i++){
                System.out.print((i)+" ");
            }

        }else{
            System.out.println();
        }






    }
}
