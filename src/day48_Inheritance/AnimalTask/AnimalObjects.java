package day48_Inheritance.AnimalTask;

import day48_Inheritance.AnimalTask.Cat;
import day48_Inheritance.AnimalTask.Dog;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog dog1=new Dog("Winston","Medium",4,'F',"Terrier",23);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        System.out.println(dog1);

        Cat cat1 = new Cat("Altunhan","Large",3,'M',"Angel",45);
        System.out.println(cat1);

    }
}
