package day32_MethodOverloading;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        String firstName="ElkEm";
        String lastName="EmET";

        String fullName;

        fullName=Util.formatFullName(firstName,lastName);
        System.out.println(fullName);

        String uniques =Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        String reversedName =Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("===============================");

        int[] a={345,76,78,90,876,21,4,56,7990};
        int n=3400;
        a=Util.addElement(a,n);
        System.out.println(Arrays.toString(a));

    }
}
