package day27_Recap;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        String[] names={"Odina","Lilia","Berk","Emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] num={34,67,89,908,7,6,54,32,1,1,2,3,4,456};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("Max number is: "+num[num.length-1]);
        System.out.println("Min number is: "+num[0]);

        System.out.println("=====================================");

        String[] s1={"A","B","C"};
        String[] s2={"A","B","C"};
        String[] s3={"B","C","A"};

        System.out.println(Arrays.equals(s1,s2)); //true
        System.out.println(Arrays.equals(s2,s3)); //false because Arrays compare with one by one

















    }
}
