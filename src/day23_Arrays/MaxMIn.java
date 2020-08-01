package day23_Arrays;

public class MaxMIn {

    public static void main(String[] args) {
        int[] arr ={5,5,4,3,5,67,1,};
        int max= arr[0];
        int min =arr[0];
        for(int i=1;i<=arr.length-1;i++){

            if(arr[i] >max){
                max=arr[i];

            } if(arr[i]<min){
                min=arr[i];

        }


        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);




    }
}
