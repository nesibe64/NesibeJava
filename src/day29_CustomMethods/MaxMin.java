package day29_CustomMethods;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers={10,3,54,7,6,89,765,33,-76,-543};
        max(numbers);
        min(numbers);
    }
    public static void max(int[] arr){
        int max=arr[0];
        for(int each:arr){
            if(each>max){
                max=each;
            }
        }
        System.out.println("Max: "+max);
    }

    public static void min(int[] arr){
        int min=arr[0];
        for(int each:arr){
            if(each<min){
                min=each;
            }
        }
        System.out.println("Min: "+min);
    }





}
