package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class t4 {
    public static void main(String[] args) {

        t3 Beslan =new t3();
        t3 Hakki=new t3();
        t3 Ali =new t3();
        t3 Veli =new t3();


        Beslan.setInfo("Checking","Beslan","2344454335");
        Hakki.setInfo("Checking","Hakki","9876543");
        Ali.setInfo("Checking","Ali","8765432");
        Veli.setInfo("Checking","Veli","765432");

        ArrayList<t3> accounts=new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Ali,Veli,Hakki));

        for(t3 each :accounts){
            each.deposit(500);
            each.getInfo();
        }
        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(2).deposit(600);
        accounts.get(2).checkBalance();
        System.out.println("===============================================");
        accounts.removeIf(each->each.balance<1000);

    }
}
