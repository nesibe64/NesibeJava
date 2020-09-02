package day32_MethodOverloading;

import java.util.Scanner;

public class formatFullName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String first=scan.nextLine();
        String last=scan.nextLine();/*

       String s1= first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
       String s2=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName = s1 + " " + s2;*/
        String fullName=formatFullName(first,last);
        System.out.println(fullName);
        System.out.println("=================================================");
        System.out.println(fullName);
    }

    public static String formatFullName(String first,String last){
        String s1= first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        String s2=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=s1+" "+s2;
        System.out.println(fullName);


      return "" ;
    }




}
