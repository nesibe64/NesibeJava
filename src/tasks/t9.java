package tasks;

import java.util.Scanner;

public class t9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String uniques="";

        for (int i = 0; i <= word.length() - 1; i++) {
            char ch=word.charAt(i);
            int first = word.indexOf(ch);
            int last =word.lastIndexOf(ch);

            if(first!=last){
                uniques +=ch;
            }
        }
        System.out.println(uniques);











    }
}
