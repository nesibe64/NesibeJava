package day49_Inheritance.ScrumTeamTask;
/*
 create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo


 */

public class Employee extends Person{

    public double Salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name,int age, char gender,double Salary,String jobTitle,int ID){
        setInfo(name, age, gender);
        this.Salary=Salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }
    public void work(){
        System.out.println(name+" is working");
    }
    public String toString() {
        return "ID: " + ID + ", Job Title: " + jobTitle +
                ", Name: " + name + ", Age: "  + age + ", Gender: " +
                gender + ", Salary: $" + Salary;
    }




}
