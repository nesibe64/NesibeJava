package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {
        //charAt
        String str="Cybertek";
        //          01234567
        char s1 = str.charAt(2);
        System.out.println(s1);

        //+:
        String str2="Cybertek";
              str2 =str2+ " School";

        System.out.println(str2);

        //length() ==> int
        String str3 = "Cybertek School";

        int l =str3.length();
        System.out.println(l);

        //lastindex:length-1

        char ch2 =str3.charAt(l-1);
        System.out.println(ch2);

        System.out.println("last index:"+(l-1));

        //upperCase & lowerCase
        String str4 = "cybertek";
        str4=str4.toUpperCase();  //CYBERTEK

        System.out.println(str4);

        String str5 = "NESIBE";
        str5=str5.toLowerCase();
        System.out.println(str5);

        //trim
        String str6="          CYbertek school               ";
        str6=str6.trim();
        System.out.println(str6);

        //substring
        String str7 = "I like Java Language";
        String word=str7.substring(7,10+1); //Java
        System.out.println(word);

        String word2 = str7.substring(12,str7.length()); //Language
        String word3  =str7.substring(12); //Language
        System.out.println(word2);
        System.out.println(word3);

        String word4 = str7.substring(9);
        System.out.println(word4);

        //indexOf & lastIndexOf ==>int
        String str8= "Hello Batch 20,Have a Wonderful day, We are happy to see you";
         int r = str8.indexOf("W");
        System.out.println(r);

        System.out.println(str8.charAt(r));

        int r2 =str8.indexOf(", W")+2;
        int r3 = str8.indexOf("We");

        System.out.println(r2);
        System.out.println(r3);

        String str9 = "Java Java Java";
        int r4=str9.lastIndexOf("J");
        System.out.println(r4);

        String a1="I like Java ,Java is a programing language";
        String a2=a1.replace("Java","C#");
        String a3=a1.replaceFirst("Java","c#");

        String a4=a1.replace(",Java",",C#");
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);














    }
}
