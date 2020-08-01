package day11_NestedIf_Switch;

public class TernaryPractices2 {
    public static void main(String[] args) {
    //write a progam a=10, b=20 output:a is greater
        int a =54;
        int b=54;
         String result=(a>b)? "a is greater" : (b>a) ? "b is greater" : "a is equal to b";
        System.out.println(result);
        System.out.println("======================");
        int num =3;
        String result2=(num==0)?"number is zero" : (num==1)? "number is one"  : (num==3)? "number is three": "invalid";
        System.out.println(result2);




    }
}
