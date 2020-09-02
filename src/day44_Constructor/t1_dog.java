package day44_Constructor;

public class t1_dog {
    String breed;
    int age;
    String name;

    public t1_dog(String name,String breed,int age){
        this.age=age;
        this.breed=breed;
        this.name=name;
    }

    public String toString(){
        return "Breed: ,"+breed+" age : ,"+age+" name: "+name;
    }
}
