package Office_Hours.practices_08_19;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {


        ArrayList<pizza> pizzaForBatch20=new ArrayList<>();


        for(int i=0;i<400;i++){
            pizza myPizza = new pizza();
            myPizza.setPizzaInfo("Large",5,3);
            pizzaForBatch20.add(myPizza);
        }

        System.out.println("Total Number of Pizza: "+pizzaForBatch20.size());
        double totalPrice =0;

        for(pizza each :pizzaForBatch20){
            totalPrice+= each.calcPrice();
        }
        System.out.println("Total Price: $"+totalPrice);

        System.out.println("==================================================");

        pizza pizza1 =new pizza();
        pizza1.setPizzaInfo("large",5,3);
        pizza pizza2 =new pizza();
        pizza2.setPizzaInfo("medium",4,9);

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
