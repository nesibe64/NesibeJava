package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {

        String[] arr={"Anam","Nickolas","Amir","Nurmamet","Ali","Ala"};

        int minLength= arr[0].length();

        for(String each: arr){  //to find out the minimum length of the string

            if(each.length()<minLength){
                minLength =each.length();
            }
        }

        System.out.println(minLength); //to see how many strings' lengths in the array is matching

        for(String each : arr){
            if(each.length()==minLength){
                System.out.println(each);
            }
        }





















    }
}
