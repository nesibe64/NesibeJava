package day44_Constructor;

public class t4_carObjects {

    public static void main(String[] args) {

        t3_car car1=new t3_car("BMW","X5",80000,2018);
        t3_car car2=new t3_car("Mercedes","Spor",85000,2019);
        t3_car car3=new t3_car("Tesla","model3",90000,2020);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);



    }
}
