package day25_Practices;

public class ShortestString {

    public static void main(String[] args) {

    String[] arr={"Anam","Nickolas","Amir","Nurmamet","Ali","Ala"};

    int minLength= arr[0].length();

    for(int i=0;i<=arr.length-1;i++){  //to find out the minimum length of the string
        int l=arr[i].length();

        if(l<minLength){
            minLength = l;
        }
    }

        System.out.println(minLength); //to see how many strings' lengths in the array is matching

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i].length()==minLength){
                System.out.println(arr[i]);
            }
        }



















        }
}


