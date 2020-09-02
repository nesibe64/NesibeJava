package day34_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";
        int a = Integer.parseInt(str);
        System.out.println(a+1);
        System.out.println(str+1);


        Double d1 = Double.parseDouble("7.5");

        System.out.println(d1-1);

        String s1="TRUE";

        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(!b1);


    }
}
