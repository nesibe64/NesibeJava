package day23_Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //String students = "Muhtar","Nadir","Asiya";



        String students[]  = {"Cybertek","Muhtar","Nadir","Asiya"};

        String name1 = students[3];

        System.out.println(name1);

        System.out.println("===========================================");

        String name[] ={"Mike","Adam","Tony","John","Amy" };

        int scores[]={85,70,95,100,49};

      /*  System.out.println( name[3]+ " : "+ scores[3]);
        System.out.println( name[2]+ " : "+ scores[2]);
        System.out.println( name[1]+ " : "+ scores[1]);
        System.out.println( name[0]+ " : "+ scores[0]);
     */

     for( int i=0;i<=4;i++){
         System.out.println(name[i]+" : "+scores[i]);

     }
        System.out.println("=============================================");
     String[] classMates = new String[5];//size is 5
        classMates[0]="apple";
        classMates[1]="Fatih";
        classMates[2]="Hazel";
        classMates[3]="Ayse";
        classMates[4]="Fatma";

        for(int i=0; i<=4;i++){
            System.out.println(classMates[i]);
        }

        System.out.println("============================");

        String[] list={"milk","banana","apple","egg","bread","pasta"};

        for(int i =0;i<= list.length-1;i++){
            System.out.println(list[i]);
        }

        System.out.println("==============================");

        String[] months ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","oct","nov","dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 1~12");
        int n=scan.nextInt();

        System.out.println(months[n-1]);





















    }
}
