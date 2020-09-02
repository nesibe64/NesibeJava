package day49_Inheritance;
/*
 create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */

import day47_Encapsulation.Test2;
import day49_Inheritance.ScrumTeamTask.Developer;
import day49_Inheritance.ScrumTeamTask.Tester;

public class AppleInc {

    public static void main(String[] args) {
        Tester tester1= new Tester("Hakki",32,'M',150000,"QA",12345678);
        Tester tester2=new Tester("Nesibe",33,'F',120000,"SDET",3455667);
        Tester tester3=new Tester("Nuri",    30,'M',130000,"QA",1234567);

        Tester[] testers={tester1,tester2,tester3};

        Developer developer1=new Developer("Hulya",55,'F',120000,"SDET",12345678);
        Developer developer2=new Developer("Derya",53,'F',130000,"QA",34567889);
        Developer developer3=new Developer("Yilmaz",30,'M',120000,"QA",2345678);

        Developer[] developers={developer1,developer2,developer3};

        ScrumTeam scrum1 =new ScrumTeam(testers,developers);

        System.out.println(scrum1);

        Tester[] testers2 ={
                new Tester("Burak",30,'M',120000,"QA",234566),
                new Tester("Sefika",29,'F',30000,"QA",3)
        };
        Developer[] developers2= {
                new Developer("Fatih", 50, 'M', 124000, "SDET",23456),
                new Developer("Ramazan", 30, 'M', 150000, "QA" ,235),
                new Developer("Aidana", 24, 'F', 160000, "QA",2345)
        };

        ScrumTeam scrum2 = new ScrumTeam(testers2,developers2);

        System.out.println(scrum2);

        System.out.println("=======================================");
        System.out.println("Testers: ");

        ScrumTeam[] allScrumTeam = {scrum1,scrum2};

       for(ScrumTeam eachScrum:allScrumTeam){
           for(Tester eachTester :eachScrum.testers){
               System.out.println(eachTester.name+"  "+eachTester.Salary);
           }
       }
        System.out.println("=========================================");
        System.out.println("Developers: ");
       for(ScrumTeam eachScrum: allScrumTeam){
           for(Developer eachDeveloper :eachScrum.developers){
               System.out.println(eachDeveloper.name+" "+eachDeveloper.Salary);
           }
       }
       


    }

}
