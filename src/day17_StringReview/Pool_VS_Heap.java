package day17_StringReview;

public class Pool_VS_Heap {
    public static void main(String[] args) {
        String s1 = "asd"; //String pool
        String s2= "asd";  //String pool
        String s3 = new String("asd"); //heap
        String s4= new String("asd");  //heap
        String s5="Asd";

        System.out.println(s3==s4); //false

        System.out.println(s2==s3); //false

        System.out.println(s1==s2); //true

        System.out.println(s5==s2);  //false

    }
}
