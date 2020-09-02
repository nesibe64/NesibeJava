package day31_Recap;

import Library.Util;

public class frequencyOfChar {
    public static void main(String[] args) {
        String str ="AABBBCCDDFGHTVGHTF"; //==> A2B3C2

        String expectedResult=""; // A2B3C3

        String nonDup= Util.removeDup(str);

 for(char each :nonDup.toCharArray()){
            int count = Util.frequency(str,each); //2
            expectedResult +=""+each +count;
        }
 /*
 for(int i=0;i<=nonDup.length()-1;i++){
           char ch1=nonDup.charAt(i);             //A B C
           int count = Util.frequency(str,ch1);   //2 3 3
           expectedResult +=""+ch1 +count;
       }
  */



/*
        char ch1=nonDup.charAt(0); //A
        int count = Util.frequency(str,ch1); //2
        expectedResult +=""+ch1 +count;

        char ch2=nonDup.charAt(1);
        int count2 = Util.frequency(str,ch2);
        expectedResult +=""+ch2 +count2;

        char ch3=nonDup.charAt(2);
        int count3 = Util.frequency(str,ch3);
        expectedResult +=""+ch3 +count3;

 */


        System.out.println(expectedResult);

        System.out.println("=========================================");

        String str2="etyehhbjjssoollaanjsowwopkakzm";

        String expectedResult2 = frequencyOfchar(str2);

        System.out.println(expectedResult2);

    }

    public static String frequencyOfchar(String str){
        String expectedResult2=""; // A2B3C3

        String nonDup= Util.removeDup(str);

        for(char each :nonDup.toCharArray()){
            int count = Util.frequency(str,each); //2
            expectedResult2 +=""+each +count;
        }
        return expectedResult2;
    }

}
