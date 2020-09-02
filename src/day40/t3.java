package day40;

public class t3 {
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setInfo(String accountHolder,String accountNumber,String accountType){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
    }

    public void getInfo(){
        System.out.println("==================================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Avaible Balance: "+balance);
        System.out.println("=================================");
    }

    public void checkBalance(){
        System.out.println("Avaible Balance : "+balance);
    }
     public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance +=amount;
    }
    public void withDraw(double amount){
        if(amount>balance){
            System.out.println("Not enough balance");
            return;
        }

        System.out.println("Withdrawing $"+amount+" from "+accountNumber);
        balance +=amount;
    }
}
