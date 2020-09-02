package day49_Inheritance.ScrumTeamTask;
/*
 create a subclass of Employee called Testers
                    Attributes:
                        name, age, gender, Salary, ID, jobTitle

                           Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()

 */

public class Tester extends Employee {

    public Tester(String name,int age, char gender,double Salary,String jobTitle,int ID){
        setInfo(name, age, gender, Salary, jobTitle, ID);
    }

    public void smokeTesting(){
        System.out.println(name+" is running smoke Test,while drinking coffee!  ");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket on JIRA");
    }





}