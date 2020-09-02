package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        maxNum(23,54);

     int b= maxNum1(34,765);
        System.out.println(maxNum1(10,43)*5);
    }


    public static void maxNum(int a,int b){
       int max=a>b ? a:b;
    }

    public static int maxNum1(int a,int b) {
        return a>b ? a:b;

    }

}
