package day39_CustomClass;

public class t4 {
    public static void main(String[] args) {
        Dog dog1 =new Dog();
        Dog dog2 =new Dog();
        Dog dog3 =new Dog();

        dog1.setDogInfo("Kangel","large",3,"black");
        dog2.setDogInfo("Roofus","small",5,"white");
        dog3.setDogInfo("REtrever","big",3,"grey");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("bread");
        dog2.eat("meat");
        dog3.eat("polo");

        dog1.drink("ayran");
        dog2.drink("cola");
        dog3.drink("water");
    }
}
