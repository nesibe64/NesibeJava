package day08_LogicalOperators;

public class Practices2 {
    public static void main(String[] args) {
        String firstName = "Conor";
        String lastName = "McNugget";
        String fullName =firstName+" "+lastName;
        int age =45;
        String citizen1 = "Turkey";
        String citizen2 ="France";
         boolean eligible = citizen1=="USA" || citizen2 =="USA";
         boolean eligibleToVote = eligible && age >=18 ;

        System.out.println(fullName +" is eligible to vote for Trump : "+eligibleToVote);










    }










}
