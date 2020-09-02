package day31_Recap;

public class WarmupTasks {
    public static void main(String[] args) {
        String str ="Aabbcddefghklm";
        String uniques="";

        for(char each:str.toCharArray()){

            int count= frequency(str,each);

            if(count==1){
                uniques +=each;
            }
        }
        System.out.println(uniques);

        System.out.println("======================");

        String str2="ppoooeirffhreejsk";
        String uniques2=uniques(str2);

    }


    public static int frequency(String str,char ch){ //finds the frequency of char from string str
        int count=0;
        for(char each:str.toCharArray()){
            if(each==ch){
                count ++;
            }
        }
        return count;
    }

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


}


