package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResources.*;  //imports all the statics

public class BankOfAzerbaijan {
    public static void main(String[] args) {


        ArrayList<Employee> list=new ArrayList<>();
        /*
        list.add(HumanResources.employee1);
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);
        */

       // list.addAll(Arrays.asList(HumanResources.employee1,employee2,employee3)  );
        //by using static import we are to import the static members,so can call them without the class

        list.addAll(Arrays.asList(employee1, employee2,employee3));

        System.out.println("Total Number of employees: "+list.size());

        System.out.println("===========================================");

        for(Employee each:list){
            System.out.println(each.name +" : "+each.salary);
        }
    }
}
