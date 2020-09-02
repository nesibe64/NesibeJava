package day40;

public class BankAccount {

    String accountType ;
    String accountHolder;
    String accountNumber;
    double balance;


    public void setAccountInfo(String clientAccountType, String name, String accNum ){
     accountType = clientAccountType ;
     accountHolder = name;
     accountNumber =accNum;

    }

    public void getAccount(){
        System.out.println("=====================================");
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Avaible Balance: "+balance);
        System.out.println("=====================================");
    }

    public void checkBalance (){
        System.out.println("Avaible Balance : "+balance);
    }
    t3 Beslan =new t3(); public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance +=amount;
    }
    public void withDraw(double amount){
        if (amount>balance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing $"+amount+" from "+accountNumber);
        balance+=amount;
    }
}
