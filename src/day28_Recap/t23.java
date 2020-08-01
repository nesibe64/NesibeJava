package day28_Recap;

import java.util.Scanner;

public class t23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        String word2=scan.next();
        int count=0;
        int l=word2.length();
       for(int i=0;i<=word.length()-l;i++){
           String s=word.substring(i,i+l);
           if(word2.equals(s)){
               count++;
           }
       }
        System.out.println(count);













    }
}
