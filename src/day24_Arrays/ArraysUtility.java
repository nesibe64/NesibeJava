package day24_Arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        String[] names={"Muhtar","Saim","Ayse"};

        System.out.println(names); //in order to print

        System.out.println(Arrays.toString(names));

        System.out.println("==========================================");

        int[] nums={56,4,3,45,7,9,0,76,4,3};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Maximum number: "+nums[nums.length-1]);
        System.out.println("Minumum number: "+nums[0]);

        String students[] ={"Mehmet","Ahmet","Ali","Meliha"};

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("=====================================");
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};

        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);

        int[] arr3={3,1,2};

        Arrays.sort(arr3);  //1,2,3
        boolean r2=Arrays.equals(arr2,arr3);
        System.out.println(r2);

        int[] arr4={1,1,2,3};
        int[] arr5={1,2,3};

        boolean r3=Arrays.equals(arr4,arr5);
        System.out.println(r3);
















    }

}
