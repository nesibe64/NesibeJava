package day26_MultiDimensionalArray;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr={2,1,3};

        int[] desc=new int[arr.length];

        /*desc[0]=arr[2];
        desc[1]=arr[1];
        desc[2]=arr[0];
*/
        int k=arr.length-1;
        for(int i=0;i<=desc.length-1;i++){
            desc[i]=arr[k];
            k--;
        }
        System.out.println(Arrays.toString(desc));





    }
}
