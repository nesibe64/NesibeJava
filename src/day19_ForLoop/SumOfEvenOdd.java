package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int sumOfEven=0;
        /*for (int i = 0; i <= 100; i+=2) {
            sumOfEven +=i;
            }
        System.out.println(sumOfEven);*/

        for(int i=0;i<=100;i++){
           sumOfEven +=i;
        }
        System.out.println(sumOfEven);
        System.out.println("==========================");

        int sumOfOdd=0;
        for(int i=1 ; i<=99 ; i+=2){
            sumOfOdd +=i;
        }
        System.out.println(sumOfOdd);













        }
    }


