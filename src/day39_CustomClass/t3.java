package day39_CustomClass;

public class t3 {
    String breed;
    String size;
    int age;
    String color;
    public void setDogInfo(String dogBreed,String dogSize,int dogAge,String dogColor){
        breed =dogBreed;
        size =dogSize;
        age = dogAge;
        color = dogColor;
    }
    public void getInfo(){
        System.out.println("Breed: "+breed+" , Size: "+size+" , Color: "+color+" ,Age: "+age);
    }

    public void eat(String dogFood){
        System.out.println("Breed: "+breed+" is eating: "+dogFood);
    }
    public void drink(String dogDrink){
        System.out.println("Breed: "+breed+" is drinking: "+dogDrink);
    }
}
