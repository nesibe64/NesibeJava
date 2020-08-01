package day12_Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 8;
        String ageGroup="";

        if(age>0 &&age <=150) {
            /*if(age>0 && age<21){
              ageGroup = " Teenager";
            }else if(age>=21 && age<=55){
                ageGroup = "Adult ";
            }else{
                ageGroup = "Senior";
            }*/
            ageGroup=(age>0 && age<21) ? "Teenager" : (age >=21 && age <=55) ? " Adult" : "Senior";
        }else{
            ageGroup=" Invalid";
        }
        System.out.println(ageGroup);
    }
}
