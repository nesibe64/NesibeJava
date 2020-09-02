package Library2;

import java.util.Arrays;

public class Util {
    public static void main(String[] args) {

    }


    public static String removeDup(String str) {
        String nonDup = "";
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        return nonDup;

    }
    //remove the duplicates and returns the value string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    //reverse the string and return the value
    public static int frequency(String str,char ch){ //finds the frequency of char from string str
        int count=0;
        for(char each:str.toCharArray()){
            if(each==ch){
                count ++;
            }
        }
        return count;
    }
    //finds the frequency of char from string str and returns it as int
    public static String uniques(String str){
        String uniques="";

        for(char each:str.toCharArray()){

            int count= frequency(str,each); //frequency of every character

            if(count==1){
                uniques +=each;
            }
        }
        return uniques;
    }
    // returns the uniques from the string
    public static String frequencyOfchar(String str){
        String expectedResult2=""; // A2B3C3

        String nonDup= Library.Util.removeDup(str);

        for(char each :nonDup.toCharArray()){
            int count = Library.Util.frequency(str,each); //2
            expectedResult2 +=""+each +count;
        }
        return expectedResult2;
    }
    // returns the frequency of every single character

    public static String formatFullName(String first,String last){
        String s1= first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        String s2=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=s1+" "+s2;
        System.out.println(fullName);


        return "" ;
    }
    //formats the full name
    public static int[] addElemet(int[] arr,int num){

        int[] arr2=new int[arr.length+1];
        arr2[arr2.length-1]=num;
        int i=0;
        for(int each: arr){
            arr2[i]=each;
            i++;
        }
        return arr2 ;
    }
    //inserts the element to the array
    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] arr2=new int[arr.length];

        int k= arr.length-1;
        for(int i=0;i<= arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    //sorts int array in descending order and returns it as int
    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);
        Integer[] arr2=new Integer[arr.length];

        int k= arr.length-1;
        for(int i=0;i<= arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    //sorts Integer array in descending order
    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);
        Double[] arr2=new Double[arr.length];

        int k= arr.length-1;
        for(int i=0;i<= arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    //sorts Double array in descending order
    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);
        Character[] arr2=new Character[arr.length];

        int k= arr.length-1;
        for(int i=0;i<= arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;
    }
    //sorts Character array in descending order
    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);
        double[] arr2=new double[arr.length];

        int k= arr.length-1;
        for(int i=0;i<= arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;

    }
    //sorts double array in descending order and returns it as double
    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);
        String[] arr2=new String[arr.length];

        int k= arr.length-1;
        for(int i=0;i<= arr2.length-1;i++){
            arr2[i]=arr[k];
            k--;
        }
        return arr2;

    }
    //sorts String array in descending order and returns it as String

    public static void uniqueElemets(int[] arr){
        for(int element : arr){
            int count=0;
            for(int b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }
    //
    public static void uniqueElemets(char[] arr){
        for(char element : arr){
            int count=0;
            for(char b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }

    public static void uniqueElemets(String[] arr){
        for(String element : arr){
            int count=0;
            for(String b:arr){
                if(element.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }

    public static void uniqueElemets(double[] arr){
        for(double element : arr){
            int count=0;
            for(double b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }
    }