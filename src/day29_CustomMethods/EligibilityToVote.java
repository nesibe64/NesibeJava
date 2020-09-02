package day29_CustomMethods;

public class EligibilityToVote {
    public static void main(String[] args) {
        Vote("John",45,true,"Biden");
        Vote("Ali",23,true,"Trunp");
        calculator(34,'%',6);
        calculator(654,'@',32);
        calculator(123,'*',654);
    }
    public static void Vote(String name,int age,boolean citizen,String candidateName){
        boolean eligibleToVote=age>=18 && citizen==true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+candidateName);
        }else{
            System.out.println("Not eligible to vote");
        }
    }

    public static void calculator(double num1,char opearator ,double num2){
        switch (opearator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }


}
