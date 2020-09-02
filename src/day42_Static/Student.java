package day42_Static;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName="Cybertek School";
    static String favoriteTeacher="Nadir";

    public void setInfo(String name,int age,int groupNumber,char gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.groupNumber=groupNumber;
    }

    public String toString(){  //instance method
        return "School Name: "+schoolName+"\nStudent Name: "+name;
        //                     static variable              instance variable
    }
}
