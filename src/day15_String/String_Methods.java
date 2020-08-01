package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567

        //charAt(index)
        char ch1 = name.charAt(6);
        char ch2 = name.charAt(5);

        System.out.println(ch1);
        System.out.println(ch2);

        int l = name.length();
        System.out.println(l);

        //last index: lenght of String - 1
        int lastIndexNumber = name.length() -1;

        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        String schoolName = "Cybertek";
        schoolName=schoolName.concat(" School");

        System.out.println(schoolName);
         //toLowerCase
        String name1="CYBERTEK SCHOOL";
               name1=name1.toLowerCase();

        System.out.println(name1);


         //toUpperCase
        String name2="nesibe";
        name2=name2.toUpperCase();
        System.out.println(name2);

        //trim():
        String p="      Cybertek School    ";
            p= p.trim();
        System.out.println(p);

        //substring


















    }
}
