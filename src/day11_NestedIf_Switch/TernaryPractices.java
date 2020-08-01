package day11_NestedIf_Switch;

public class TernaryPractices {
    public static void main(String[] args) {
        int n1=100;
        int n2=200;

        String r = (n1==n2) ? "Equal ": "Not Equal";
        System.out.println(r);
        System.out.println("================");

        int num =100;
        String result ="";

        if (num>0){
            result="positive";
        }else if(num<0){
            result="negative";
        }else{
            result="zero";
        }
        System.out.println(result);

        String result2 = (num>0)? "positive" :(num<0) ? "negative" : "zero";
        System.out.println(result2);









    }
}
