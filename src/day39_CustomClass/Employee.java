package day39_CustomClass;

public class Employee {

        /*
        Attributes
         */
        String name;
        char gender;
        long SSN;
        String jobTitle;
        double salary;


        public void setEmployeeInfo(String employeeName, char employeeGender, long employeeSSN, String employeeJobTitle,
        double employeeSalary){
            name = employeeName;
            gender = employeeGender;
            SSN = employeeSSN;
            jobTitle= employeeJobTitle;
            salary=employeeSalary;
        }
        public void getEmployeeInfo(){
            System.out.println("============================================");
            System.out.println("Name: "+name+"\nGender: "+gender+"\nJob Title: "+jobTitle);
            String ssn = ""+SSN;
            System.out.println("SSN: "+ssn.substring(ssn.length()-4));
            System.out.println("Salary: $"+salary);
            System.out.println("===========================================");
        }


























}
