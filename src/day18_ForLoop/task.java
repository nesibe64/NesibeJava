package day18_ForLoop;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word=scan.next();

        int l= word.length();
        String halfWord=word.substring(0,l/2);
        System.out.println(halfWord+halfWord);









    }
}
