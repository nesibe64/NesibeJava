package day18_ForLoop;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String abc =s.nextLine();

        char third=abc.charAt(2);
        char fifth=abc.charAt(4);
        char sixth=abc.charAt(5);
        System.out.println(""+third+fifth+sixth);
    }
}
