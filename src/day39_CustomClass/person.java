package day39_CustomClass;

public class person {
    String name;
    int age;
    String hobby;
    String job;

    public void setInfoClass(String Cname,int Cage,String Chobby,String Cjob) {
    name=Cname;
    age=Cage;
    hobby=Chobby;
    job=Cjob;
    }
    public void getInfoClass(){
        System.out.println(name+" age: "+age+"  hobby: "+hobby+"  job: "+job);
    }
    public void eat(String classEat){
        System.out.println(name+" is eating "+classEat);
    }
    public void drink(String classDrink){
        System.out.println(name+"  is drinking: "+classDrink);
    }
}
