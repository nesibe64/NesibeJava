package day39_CustomClass;

public class t6 {
    public static void main(String[] args) {

        person p=new person();
        person p1=new person();
        person p2=new person();

        p.setInfoClass("Aliye",23,"read","teacher");
        p1.setInfoClass("Halime",34,"swim","artchitect");
        p2.setInfoClass("Hulya",18,"climbing","student");


        p.getInfoClass();
        p1.getInfoClass();
        p2.getInfoClass();

        p.eat("apple");
        p1.eat("banana");
        p2.eat("cake");

        p.drink("cola");
        p1.drink("milk");
        p2.drink("water");

    }
}

