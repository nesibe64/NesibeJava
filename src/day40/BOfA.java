package day40;

public class BOfA {
    public static void main(String[] args) {

     BankAccount Dawud=new BankAccount();
     Dawud.setAccountInfo("Saving","Dawud abduwali","123456789");

     Dawud.getAccount();

     Dawud.deposit(1000);

     Dawud.checkBalance();

     Dawud.withDraw(500);
    }
}
