package day21_Loops;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word=scan.next();
        if(word.length()%2!=0 && word.length()>=5){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else
            System.out.println("Invalid");





    }
}
