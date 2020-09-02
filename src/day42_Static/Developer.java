package day42_Static;

public class Developer {


    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;


    public  void setInfo(String name,char gender,long employeeID, String jobTitle,double salary){
        this.name=name;
        this.gender=gender;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixBug(){
        System.out.println(name+" is fixing the bug ");
    }
    public String toString(){
        return "Name: "+name+"gender: "+gender+" EmployeeId: "+employeeID+" job title: "+jobTitle+" salary: "+salary;
    }
}
