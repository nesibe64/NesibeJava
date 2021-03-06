package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        Integer[] nums={80,90,100};
        int[] nums2={6,7};

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList(50,60,70));
        list2.addAll(Arrays.asList(nums));
        //list2.addAll(Arrays.asList(nums2));  collections does not support primitives

        System.out.println(list2);
/*

        list2.remove(8);

        list2.remove(new Integer(80));
        list2.remove(new Integer(30));

        System.out.println(list2);
*/
    list2.removeAll(Arrays.asList(20,10));
    list2.removeIf( p -> p > 50);
        System.out.println(list2);

        list2.addAll(Arrays.asList(100,200,300,100,100,100));
        System.out.println(list2);
        list2.retainAll(Arrays.asList(100,200,300));

        System.out.println("Size: "+list2.size());
        System.out.println("=================================================");

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8,9,10,11,12,13));

        list3.set(list3.size()-1,30);
        System.out.println(list3);

        for(int i=0;i<=list3.size()-1;i++){
           Integer each =list3.get(i);
           if(each%2!=0){
               list3.set(i,each*2);
           }else{
               list3.set(i,each*3);
           }
        }

        System.out.println(list3);

        System.out.println("=============================================");

        ArrayList<String> countries =new ArrayList<>();
        countries.addAll(Arrays.asList("America","England","Australia","New Zeland","Russia","Canada"));
        //countries.removeIf(c->c.endsWith("a"));

        //System.out.println(countries);
       // countries.removeIf(c->c.charAt(c.length()-1)=='d');
        //                last char from c         =='d'

        //countries.removeIf(c->c.startsWith("A"));
        countries.removeIf(c->c.charAt(0)=='A');

        System.out.println(countries);


    }
}
