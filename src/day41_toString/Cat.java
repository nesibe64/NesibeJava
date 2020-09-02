package day41_toString;

public class Cat {
    String name;
    int age;
    char gender;
    String color;

    public  void setCatInfo(String name,int age,char gender,String color){
        this.age=age;
        this.color=color;
        this.gender=gender;
        this.name=name;
    }
    public String toString(){ //will be executed automatically when the cat onject is passed in the print statement.
        return name+" "+"gender: "+gender+" "+color+", "+age;
    }
    public void eat(String catFood){
        System.out.println(name+" is eating "+catFood);
    }
    public void drink(String catDrink){
        System.out.println(name+" is drinking "+catDrink);
    }
}
