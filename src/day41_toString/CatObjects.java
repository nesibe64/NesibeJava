package day41_toString;

import java.util.ArrayList;

public class CatObjects {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();
        Cat cat5=new Cat();

        cat1.setCatInfo("Engora",3,'M',"white");
        cat2.setCatInfo("Mavis",3,'F',"grey");
        cat3.setCatInfo("kucu kucu",2,'M',"black");
        cat4.setCatInfo("aboo",4,'F',"yellow");
        cat5.setCatInfo("pisi",1,'M',"red");
        System.out.println("==================================");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
        System.out.println("==================================");

        cat1.eat("bread");
        cat2.eat("fish");
        cat3.eat("chicken");
        cat4.eat("banana");
        cat5.eat("bread");
        System.out.println("===================================");
        cat1.drink("milk");
        cat2.drink("water");
        cat3.drink("juice");
        cat4.drink("cola");
        cat5.drink("fanta");
        System.out.println("====================================");

        Cat[] catPark={cat1,cat2,cat3,cat4,cat5};
        for(Cat each:catPark ){
            System.out.println(each);
        }
        System.out.println("=====================================");

        ArrayList<Cat>femaleCats=new ArrayList<>();
        ArrayList<Cat>maleCats=new ArrayList<>();

        for(int i=0;i<= catPark.length-1;i++ ){
            if(catPark[i].gender=='M'){
                maleCats.add(catPark[i]);
            }else {
                femaleCats.add(catPark[i]);
            }
        }
        System.out.println("Female cats :  "+femaleCats);
        System.out.println("Male cats : "+maleCats);

    }
}
