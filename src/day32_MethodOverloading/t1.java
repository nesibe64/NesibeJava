package day32_MethodOverloading;

import java.util.Arrays;

public class t1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {54, 32, 9};
        combine2Array(arr1, arr2);
    }

    public static void combine2Array(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        //                       5    +    3
        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
            int k = 0;
            for (int j = arr1.length; j <= arr1.length + arr2.length - 1; j++) {
                arr3[j] = arr2[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void combine2Array(double[] arr3, double[] arr4) {
        double[] arr2 = new double[arr3.length + arr4.length];

    }
}
