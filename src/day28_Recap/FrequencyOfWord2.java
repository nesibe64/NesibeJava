package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String word=scan.next();
        int l=word.length();
        //(0,3)
        int count=0; //"cat"
        for(int i=0;i<=str.length()-l;i++){
         String s=  str.substring(i,i+l);
            if(s.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);

















    }
}
