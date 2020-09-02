package day42_Static;

public class CapitalOne {

    public static void main(String[] args) {

        Tester[] testers={new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Yilmaz",'M',34556,"OA",120000);
        testers[1].setInfo("Burak",'M',34567,"OA",124000);
        testers[2].setInfo("M.Nuri",'M',34556,"SDET",130000);

        Developer[] developers={new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),};
        developers[0].setInfo("Derya",'F',789654,"Dev Lead",140_000);
        developers[1].setInfo("Emire",'F',654789,"Dev",130_000);
        developers[2].setInfo("Nunu",'F',635241,"Dev Art",130_000);
        developers[3].setInfo("Usame",'M',145263,"Junior Dev",100_000);
        developers[4].setInfo("Sefika",'F',968574,"Junior Dev",10_000);

        ScrumTeam team1=new ScrumTeam();

        team1.setInfo("Hakki","Nesibe","Hulya");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        team1.removeDeveloper(968574);
        team1.removeDeveloper(145263);
        Developer dev1 = new Developer();
        dev1.setInfo("Ummugulsum",'F',365248,"Dev",120_000);
        team1.addDeveloper(dev1);
        System.out.println(team1);
        System.out.println("==================================================");
        for (Tester each: team1.testers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("====================================================");
        for (Developer each: team1.developers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("===================================================");

        ScrumTeam[] scrumTeams={team1,new ScrumTeam(),new ScrumTeam()};





    }

}
