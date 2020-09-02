package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;

public class Array_REcap2 {

    public static void main(String[] args) {

        int[] nums={2,3,4,5,6,7,8};

        for(int each:nums ){
            if(each % 3 !=0){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("======================================");

        String[] names={"NESibe","Halit","AZize","Eda","Eylem "};

        for(String each:names){
            if(each.toLowerCase().contains("a")){
                System.out.println(each);
            }
        }
        System.out.println("===================================================");

        int[] arr1={5,6,87,43,233,-78,0,-987};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] names2={"NESibe","Halit","AZize","Eda","Eylem "};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));
        System.out.println("====================================================");

        int[] a1={1,2,3,4};
        int[] a2={1,2,4,3};

        System.out.println(Arrays.equals(a1,a2));  //check elements at each indexes one by one

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));

    }
}
