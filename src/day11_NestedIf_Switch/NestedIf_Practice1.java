package day11_NestedIf_Switch;

public class NestedIf_Practice1 {
    public static void main(String[] args) {
        double salary=20000;
        int jobHistory= 6;

        if (salary >= 30000) {
            if(jobHistory>=2){
                System.out.println("You are qualified");
            }else{
                System.out.println("You must have been on job at least 2 year");
            }

        }else{
            System.out.println("You MUST earn at least $30K");
        }









    }
}
