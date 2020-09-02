package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {

    public static void main(String[] args) {

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
        //                          0 1   2  3  4  5  6  7  8

        Collections.swap(list1,0,1);
        Collections.swap(list1,list1.size()-2,list1.size()-1);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
        System.out.println("========================================");

        String[] arr={"Eggs","Orange","Milk","Toilet paper","Toilet paper","Toilet paper","Toilet paper"};
        ArrayList<String> items=new ArrayList<>();
        items.addAll(Arrays.asList(arr));
        System.out.println(items);

        int count =Collections.frequency(items,"Toilet Paper");
        System.out.println(count);

        //items.removeIf(I-> Collections.frequency(items,I)==1); //remeoves the unique items
        items.removeIf(I->Collections.frequency(items,I) !=1);
        System.out.println(items);

    }
}
