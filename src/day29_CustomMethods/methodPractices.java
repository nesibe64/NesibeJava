package day29_CustomMethods;

public class methodPractices {
    public static void main(String[] args) {
      oddNumber();
        System.out.println();
        evenNumber();
    }


    public static void oddNumber(){
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void evenNumber(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
