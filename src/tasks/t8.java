package tasks;

import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for(int i=0;i<=word.length()-1;i++){
           if(i%2==0){
               String ch=""+word.charAt(i);
               System.out.print(ch);
           }else{

           }

        }








    }
}
