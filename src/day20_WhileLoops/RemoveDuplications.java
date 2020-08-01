package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplications {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

      String str=scan.nextLine();
      String result="";

      for(int i=0;i<=str.length()-1 ; i++){
       String s = ""+str.charAt(i);
         // if(!result.contains(s)){
          if(result.contains(s)) {
            continue;
          }
              result +=s;
          }


        System.out.println(result);









    }
}
