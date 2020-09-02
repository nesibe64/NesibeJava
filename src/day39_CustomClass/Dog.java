package day39_CustomClass;

public class Dog {
    /*
    Instance variable:
    breed,size,age,color

    instance method:
    setDogInfo,getDogInfo,eat,drink,sleep
     */
    String breed;
    String size;
    int age;
    String color;
    public void setDogInfo(String dogBreed,String dogSize,int dogAge,String dogColor){
        breed = dogBreed;
        size = dogSize;
        age =dogAge;
        color =dogColor;
    }
     public void getDogInfo(){
         System.out.println(" Breed: "+breed+",Size: "+size+",Color: "+color+",Age: "+age+" years old");
     }

     public void eat(String dogFood){
         System.out.println(breed+" is eating "+dogFood);
     }

     public void drink(String dogDrink){
         System.out.println(breed+" is drinking "+dogDrink);
     }
     public void sleep(){
         System.out.println(breed+" is sleeping ");
     }
     public void play(){
         System.out.println(breed+" is playing ");
     }


}
