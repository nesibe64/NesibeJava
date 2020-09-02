package day44_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(String arr){
        System.out.println("Hello: "+arr);
        System.out.println("How are you: "+arr);
    }

    public static void main(String[] args) {

        // ConstructorIntro obj =new ConstructorIntro();

        ConstructorIntro obj2 = new ConstructorIntro("Muhtar");
        ConstructorIntro obj3 = new ConstructorIntro("Hakki");
        ConstructorIntro obj4 = new ConstructorIntro("Davud");



    }


}


