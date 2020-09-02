package day24_Arrays;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        String expectedResult="";

        for(int j=0;j<=str.length()-1;j++){
            char each=str.charAt(j);
            int count=0;
            for(int i=0;i<=str.length()-1;i++){
                char ch1=str.charAt(i);
                if(each==ch1){
                  count +=1;
                }
            }

            if(count==1){
             expectedResult += each;

            }

        }
        System.out.println(expectedResult);

    }
}
