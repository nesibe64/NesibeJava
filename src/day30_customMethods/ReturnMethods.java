package day30_customMethods;

public class ReturnMethods {
    public static void main(String[] args) {
      addition1(4,65);

      int sum=addition2(10,20);
        System.out.println(sum);

        System.out.println(addition2(3,4) *2);
    }

    public static void addition1(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static int addition2(int a,int b){
        int sum=a+b;
        return sum;
    }

}
