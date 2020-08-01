package day19_ForLoop;

public class Odd_Even {
    public static void main(String[] args) {
        for(int i=1;i<=100;i+=2){
            if(i%3==0 && i%5==0)
            System.out.print(i+" ");
        }

        System.out.println();


        for(int i=0;i<=100;i+=2){
            if(i%3==0 && i%5==0)
                System.out.print(i+" ");
        }
        System.out.println();

        for(int i=0;i<=100;i++){
            if(i%2==0){  //must be even number
                if(i%3==0 && i%5==0) //must be divisible by 3&5
            System.out.print(i+" ");

                System.out.println();









            }
        }
















    }
}
