package tasks;

import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for(int i=0;i<=word.length()-1;i++){
            String ch=" " +word.charAt(i);
            System.out.println(ch);
        }












    }
}

