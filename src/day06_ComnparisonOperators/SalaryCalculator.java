package day06_ComnparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate=55.25;
        double stateTaxRate=0.04;
        double federalTaxRate=0.2;
        int weeklyHours= 45;

        double salary= rate*weeklyHours*48;
        System.out.println("salary is : "+salary+"USD");
        double totalTaxRate=salary*(stateTaxRate+federalTaxRate);
        double salaryAfterTax =salary-totalTaxRate;
        System.out.println("totalTaxRate: "+totalTaxRate+"$");
        System.out.println("salaryAfterTax: "+salaryAfterTax);








    }







}
