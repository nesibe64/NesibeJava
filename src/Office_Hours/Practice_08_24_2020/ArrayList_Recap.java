package Office_Hours.Practice_08_24_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Recap {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(list1);

        for(int each:list1){
            System.out.println(each);
        }
        System.out.println("========================================");

        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(20,49,6,5,432,45,78,90,876,765));
        list2.removeAll(Arrays.asList(49,90,78));

        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);

        System.out.println(list2.get(0));
        System.out.println(list2.get(list2.size()-1));
        //set
        list2.set(0,300);
        System.out.println(list2);

        Collections.sort(list2);

        System.out.println(list2);

        System.out.println("========================================");

        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Hakki","Halit","NEsibe","Ayse","Fatma"));

        names.removeIf(p->p.equals("Hakki") );
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(78,67,45,7,89,88,65,32,56));
        numbers.removeIf(p->p<50);

        System.out.println(numbers);

        ArrayList<String> students =new ArrayList<>();
        students.addAll(Arrays.asList("Askat","Viorel","Ziaddin","Dilafruz","Mehray"));
        students.retainAll(Arrays.asList("Askat","Ziaddin"));
        System.out.println(students);


    }

}
