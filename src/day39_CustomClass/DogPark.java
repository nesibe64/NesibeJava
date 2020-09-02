package day39_CustomClass;

public class DogPark {
      //dogPark
      public static void main(String[] args) {
          Dog dog1=new Dog();

          Dog[] dogPark={new Dog(),new Dog(),new Dog(),new Dog(),new Dog() };
                    //          0       1         2         3         4

          dogPark[0].setDogInfo("German Shepperd","small",12,"black");
          dogPark[1].setDogInfo( "Anatolian Sheppard", "Large",  2, "White");
          dogPark[2].setDogInfo("Retriver","small",2,"Grey");
          dogPark[3].setDogInfo( "Pitbull","large", 1, "White");
          dogPark[4].setDogInfo("Grizzl","BoxerPitt",3,"Mix");



          for(int i=0;i<= dogPark.length-1;i++){
              dogPark[i].getDogInfo();
          }

          System.out.println("======================================================");

          for(Dog eachDog:dogPark){
              eachDog.getDogInfo();
          }

          System.out.println("======================================================");
          String dogFood="treats";
          for(Dog eachDog:dogPark){
              eachDog.getDogInfo();
          }

          System.out.println("=======================================================");
          String dogDrink="milk";
          for(Dog eachDog:dogPark){
              eachDog.getDogInfo();
          }

          System.out.println("=======================================================");
          for(Dog eachDog:dogPark){
              eachDog.getDogInfo();
          }












      }
}
