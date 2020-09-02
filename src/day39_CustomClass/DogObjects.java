package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();

        dog1.setDogInfo("Kangal","large",3,"white");
        dog2.setDogInfo("Roofus","small",1,"red");
        dog3.setDogInfo("Terrier","medium",4,"blue");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");
        dog2.eat("Steak");
        dog3.eat("polo");

        System.out.println("==============================");

        dog1.drink("Cola");
        dog2.drink("Fanta");
        dog3.drink("Gazoz");

        System.out.println("==============================");

        dog1.sleep();














    }
}
