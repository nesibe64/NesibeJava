package day41_toString;

public class printingCustomClassObjects {
    public static void main(String[] args) {
        String str=new String("Cybertek");
        System.out.println(str.toString());
        System.out.println(new String("School"));

        System.out.println(str.toString());
        System.out.println(new String("School").toString());

        System.out.println("============================================");

        Carpet c1=new Carpet();
        c1.customOrders(5,6,7,true);

        System.out.println(c1);
    }
}
