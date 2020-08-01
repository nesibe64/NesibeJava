package day17_StringReview;

public class String_Methods2 {
    public static void main(String[] args) {
        String s1="Cat"; //String pool
        String s2=new String("Cat"); //heap
        String s3=new String("Cat");


        System.out.println(s1==s2); //false

        System.out.println(s1.equals(s2)); //true

        System.out.println(s2==s3);  //false

        System.out.println(s2.equals(s3));  //true

        String s4 = "Java";
        String s5= "java";

        System.out.println(s4==s5); //false
        System.out.println(s4.equals(s5));  //false

        System.out.println(s4.equalsIgnoreCase(s5));  //true

        //isEmpty: checks if the length of string is 0

        String str="  ";
        System.out.println(str.isEmpty()); //false

        str=str.trim();

        System.out.println(str.isEmpty()); //true

        String str2 = "Cybertek";
        System.out.println(str2.isEmpty()); //false

        //contains : included or not
        String str3 ="Java,C#,python,ruby,c++";
        System.out.println(str3.contains("Java")); //true
        System.out.println(str3.contains("java")); //false

        System.out.println(str3.toLowerCase().contains("java")); //true

        String str4="ABCD";
        System.out.println(str4.contains("D"));

        //startsWith & endsWith

        String str5="Cybertek";
        System.out.println(str5.startsWith("Cyb"));

        System.out.println(str5.startsWith("s")|| str5.startsWith("C"));

        String str6="Today is a great day";

        System.out.println(str6.endsWith("day"));


















    }
}
