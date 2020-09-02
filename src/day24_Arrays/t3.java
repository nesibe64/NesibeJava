package day24_Arrays;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        String result="";

        for(int i=0;i<=word.length()-1;i++){
            int count=0;
            char ch=word.charAt(i);
            for(int j=0;j<=word.length()-1;j++){
                char each=word.charAt(j);
                if(each==ch){
                    count++;
                }
            }
            if(count==1){
                result+=ch;
            }
        }
        System.out.println(result+" ");
    }
}
