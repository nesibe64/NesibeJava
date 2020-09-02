package day29_CustomMethods;

public class returnKeybord {
    public static void main(String[] args) {
    grade(786);
        System.out.println("Task completed");
    }

    public static void grade(int score){
        if(0> score || score>100){
            System.out.println("Invalid entry");
           // System.exit(0);
        return;
        }else{
            char grade=(score>=90)?'A' : ( score>=80 )? 'B' :(score>=70) ? 'C':(score>=60) ? 'D':'F';
            System.out.println("Grade is: "+ grade);
        }

    }
}

