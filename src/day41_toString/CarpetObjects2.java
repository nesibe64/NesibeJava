package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {
        Carpet[] carpets ={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrders(4.5,6.5,7.6,true);
        carpets[1].customOrders(3.4,5.6,7,false);
        carpets[2].customOrders(2.5,7,8,true);
        carpets[3].customOrders(5.7,8,9,false);
        carpets[4].customOrders(4,6,8,false);

        /*for (Carpet each: carpets){
            each.getCarpetInfo();
        }*/
        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);//removing the carpets that are not persian

        ArrayList<Carpet> regularCarpets=new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        //regularCarpets.removeIf(p->p.isPersian);
        //regularCarpets.removeAll(persianCarpets);


        System.out.println("Number of persian Carpets: "+persianCarpets.size());
        System.out.println("Number of regular Carpets: "+regularCarpets.size());

    }
}
