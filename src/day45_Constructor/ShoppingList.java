package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    /*
   create a class called ShoppingList
                  create 5 objects of Item and store them into List of Items
                  calculate the total cost of all Items in the list
   */
    public static void main(String[] args) {
        Item apple = new Item("Apple", 1.34,5);
        Item orange = new Item("Orange", 2.54,8);
        Item banana = new Item("Banana", 0.5,10);
        Item lambMeet = new Item("Lamb",5.9,10);
        Item iceCream = new Item("IceCream",10.2,1);

        ArrayList<Item>list=new ArrayList<>();
        list.addAll(Arrays.asList(apple,orange,banana,lambMeet,iceCream));

        System.out.println("Items: "+list.size());
        double totalCost=0;

        for(Item each:list ){
            totalCost +=each.calcCost();
        }
        System.out.println("Total Price: "+totalCost);

        System.out.println("==============================================");

        Item[] items={apple,orange,banana,lambMeet,iceCream};
        double totalCost2 =0;

        for(int i=0; i<=items.length-1;i++){
            totalCost2 +=items[i].calcCost();
        }

        System.out.println("Total Cost: "+totalCost2);







    }

}
