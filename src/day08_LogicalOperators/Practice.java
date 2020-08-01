package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String fullName = "Aaron Daniel";



        int age=15;
        String citizenShip = "turkey";

        boolean eligibleToVote = age >= 18 && citizenShip=="USA"  ;

        System.out.println(fullName+" is eligible to vote : "+ eligibleToVote);

        boolean r6 =8>6 && !false;
        System.out.println(r6);

        boolean r7 =true ==!false || false==true;
        System.out.println(r7);

        boolean r9 = !false==false && true == !false ;
        System.out.println(r9);

        boolean r10 = 67<7 || 3>5;
        System.out.println(r10);










    }












}
