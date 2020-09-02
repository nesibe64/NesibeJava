package day49_Inheritance.ScrumTeamTask;
/*
create a subclass of Employee called called Developer
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle

                                 Actions:
                        setInfo(), coding(),  fixBug(), toString()
 */

public class Developer extends Employee {

    public Developer (String name,int age, char gender,double Salary,String jobTitle,int ID){
        setInfo(name, age, gender, Salary, jobTitle, ID);
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBug(){
        System.out.println(name+" is fixing the Bug");
    }

}
