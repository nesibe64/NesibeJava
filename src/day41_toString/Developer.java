package day41_toString;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name,double salary,String gender,int age){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.age=age;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+",Age: "+age+",salary: "+salary;
    }
}

class DeveloperObject{

    public static void main(String[] args) {
        Developer[] developers={new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Ahmet",22345,"Male",34);
        developers[1].setInfo("Hakki",122345,"Male",34);
        developers[2].setInfo("Nesibe",222345,"Female",24);
        developers[3].setInfo("Ali",12345,"Male",54);
        developers[4].setInfo("Ajit",52345,"Male",44);

        for(Developer each:developers){
            each.coding();
        }
        System.out.println("=====================");
        for(int i=0;i<= developers.length-1;i++){
            developers[i].fixBugs();
        }
    }
}
