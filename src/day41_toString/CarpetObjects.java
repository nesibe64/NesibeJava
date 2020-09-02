package day41_toString;

import java.util.ArrayList;

public class CarpetObjects {
    public static void main(String[] args) {

       Carpet[] carpets ={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

       carpets[0].customOrders(4.5,6.5,7.6,true);
       carpets[1].customOrders(3.4,5.6,7,false);
       carpets[2].customOrders(2.5,7,8,true);
       carpets[3].customOrders(5.7,8,9,false);
       carpets[4].customOrders(4,6,8,false);

     /*  for(Carpet each :carpets ){
           each.getCarpetInfo();
       }*/

        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        ArrayList<Carpet> regularCarpets=new ArrayList<>();

       /* for(int i=0;i<= carpets.length-1;i++){
            if(carpets[i].isPersian){
                persianCarpets.add(carpets[i]);
            }else{
                regularCarpets.add(carpets[i]);
            }

        }*/

        for (Carpet carpet : carpets) {
            if (carpet.isPersian) {
                persianCarpets.add(carpet);
            } else {
                regularCarpets.add(carpet);
            }
        }

        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets:  "+regularCarpets.size());



    }
}
