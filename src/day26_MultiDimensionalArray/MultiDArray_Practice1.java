package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {
    public static void main(String[] args) {
        String[] testers={"ali","veli","selami"};
        String[] developers={"ayse","fatma","hayriye"};
        String[] SM={"nur"};
        String[] PO={"nane"};

        String[][] scrumTeam={testers,developers,SM,PO};
        String[] testers2={"nunu","munu","kunu"};

        scrumTeam[1][2]="aliye";
        scrumTeam[3][0]="sanane";

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("============================");

        for(String[] each : scrumTeam){
          for(String name :each){
              System.out.println(name);
          }

        }
        System.out.println("=========================================");
       // System.out.println(Arrays.deepToString(scrumTeam));

       int[][]scores={{19,20,30,45},{60,55,75,105},{93,48,125,135,8,67,31}};
         //               0               1            2

         for(int[] each1DArray:scores){
             for(int eachElement :each1DArray){
                 if(eachElement %3==0 || eachElement %5==0){
                     System.out.print(eachElement + " ");
                 }

             }
         }
        System.out.println("=========================================");






    }
}
