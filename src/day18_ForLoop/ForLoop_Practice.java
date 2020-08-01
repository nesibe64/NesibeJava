package day18_ForLoop;

import java.util.Scanner;

public class ForLoop_Practice {
    public static void main(String[] args) {
    for(char i=97;i<=122;i++ ){
        System.out.print(i+" ");

    }
        System.out.println("");

    for(char a=65;a<=90;a++){
        System.out.print(a+" ");
    }
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word");
        String word=scan.next();

        char ch1=word.charAt(0);
        char ch2=word.charAt(word.length()-1);

        System.out.println(""+ch1+ch2);
























    }
}
