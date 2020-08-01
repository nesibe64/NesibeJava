package day25_Practices;

import day23_Arrays.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={4,5};

        int size =arr.length+arr2.length;

        int[] arr3=new int [size];

        int index=0;
        for(int each:arr){
            arr3[index]=each;
            index+=1;
        }
        for(int each:arr2){
         arr3[index] =each;
            index++;
        }








    }
}
