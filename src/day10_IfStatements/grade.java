package day10_IfStatements;

public class grade {
    public static void main(String[] args) {
        int score=150;
        String message = "";

        if (score>=90 && score<=100 ){
            message="You made  A";
        }else if (80<= score && score <=89){
            message="You made B";
        }else if(70<= score && score <=79 ){
            message ="You made C";
        }else if (60<= score&& score<=69){
            message = "You made D";
        }else{
            message = "You made F";
        }
        System.out.println(message);









    }
}
