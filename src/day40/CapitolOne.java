package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitolOne {

    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();
        BankAccount Ali = new BankAccount();
        BankAccount Mehmet = new BankAccount();
        BankAccount Kazim = new BankAccount();
        BankAccount Huseyin = new BankAccount();
        Beslan.setAccountInfo("Checking","Beslan","475469123654");
        Ali.setAccountInfo("Checking","Ali","369852147852");
        Mehmet.setAccountInfo("Checking","Mehmet","321654987456");
        Kazim.setAccountInfo("Checking","Kazim","321654987159");
        Huseyin.setAccountInfo("Checking","Huseyin","789654321357");


        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Ali,Mehmet,Kazim,Huseyin));

        for (BankAccount each: accounts){
            each.deposit(500);
            each.getAccount();
        }
        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();
        System.out.println("==========================================================");
        accounts.removeIf(each->each.balance<1000);
}   }


