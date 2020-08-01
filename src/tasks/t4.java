package tasks;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();

        if(name != "Chen" ){
            System.out.println("student");
        }else{
            System.out.println("teacher");
        }



    }
}
