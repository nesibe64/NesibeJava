package day44_Constructor;

public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {  //runs first ONLY one time
        hasSalary=true;
    }


    public void setEmployeeInfo(String name,int id,int ssn,String jobTitle,double salary,char gender){
        this.gender=gender;
        this.id=id;
        this.jobTitle=jobTitle;
        this.name=name;
        this.salary=salary;
        this.ssn=ssn;
    }

    public String toString(){
        return "Name: "+name+"\n Gender: "+gender+"\n ID: "+id+"\nSSN: "+ssn+"\n JobTitle:"+jobTitle+
                "\n Salary: "+salary;
    }
}
