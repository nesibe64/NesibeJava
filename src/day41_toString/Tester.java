package day41_toString;

class TesterObject{
    public static void main(String[] args) {
        Tester[] testers={new Tester(),new Tester(),new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Aalia",23456,"Female",19);
        testers[1].setInfo("Naz",53456,"Female",29);
        testers[2].setInfo("Rakhat",53456,"Female",79);
        testers[3].setInfo("Edward",73456,"Male",69);
        testers[4].setInfo("Azize",12456,"Female",19);

        for( Tester each:testers ){
            System.out.println(each);
        }
    }
}















public class Tester {
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

    public String toString(){
        return "Name: "+name+", Gender: "+gender+",Age: "+age+",salary: "+salary;
    }
}



