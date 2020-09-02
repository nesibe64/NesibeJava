package day40;

public class t1 {
    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void sett1Info(double salary,String state,boolean hasPTO,boolean isFullTime,boolean isWFH,String jobTitle,boolean hasBenefit){
        this.salary=salary;
        this.hasBenefit=hasBenefit;
        this.hasPTO=hasPTO;
        this.isFullTime=isFullTime;
        this.isWFH=isWFH;
        this.jobTitle=jobTitle;
        this.hasBenefit=hasBenefit;
        this.state=state;
    }

    public void gett1Info(){
        System.out.println("================================");
        System.out.println("Salary: "+salary);
        System.out.println("JobTitle: "+jobTitle);
        System.out.println("Location: "+state);
        System.out.println("================================");
    }
}
