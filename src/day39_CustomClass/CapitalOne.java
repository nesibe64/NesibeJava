package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


        employee1.setEmployeeInfo("Roman", 'M', 321456753, "QA", 120000);
        employee2.setEmployeeInfo("Hakki", 'M', 448713698, "SDET", 130000);
        employee3.setEmployeeInfo("Nesibe", 'F', 63212789, "QA", 100000);
        employee4.setEmployeeInfo("Ali", 'M', 12323345, "QA", 23234);
        employee5.setEmployeeInfo("Hulya", 'F', 234565, "SDET", 9876867);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        double max=Integer.MIN_VALUE;
        String name="";
        for(Employee each:employeeList){
            double eachSalary= each.salary;
            if(eachSalary>max){
                max=eachSalary;
                name=each.name;
            }
        }
        System.out.println("Maximum Salary: "+max);
        System.out.println("Name: "+name);

        employeeList.removeIf(p->p.salary>140000);

        for(Employee each:employeeList){
            //each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }

    }
}