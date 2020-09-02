package day44_Constructor;

public class Student {
    String name;
    int age;
    char gender;
    static String schoolName="Cybertek University";

    public Student(String name, int age,char gender){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

   /* public void setInfo(String name,int age,char gender){
        this.age=age;
        this.gender=gender;
        this.name=name;
    }*/

    public String toString(){
      return   "Student name: "+name+"\nStudent age: "+age+"\nStudent gender: "+gender+", School name: "+schoolName;
    }

    //dog , car ,pizza ,bank do it for construction


}
