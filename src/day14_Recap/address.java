package day14_Recap;


import java.util.Scanner;

public class address {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your building number");
    int buildingNumber=input.nextInt();

    input.nextLine();
    System.out.println("Enter your street address");
    String address=input.nextLine();

    System.out.println("Enter your city name");
    String cityName=input.nextLine();


    System.out.println("Enter your zip code");
    int zipCode=input.nextInt();

    input.nextLine();
    System.out.println("Enter your full name ");
    String fullName= input.nextLine();

    System.out.println("Ship to: "+fullName+"\n"+ buildingNumber+" "+address+"\n"+cityName+", "+zipCode);































  }
  }
