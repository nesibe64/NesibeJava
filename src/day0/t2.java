package day0;

public class t2 {
    public static void main(String[] args) {
        String str="aabbcde";
        String result="";


        for(char each:str.toCharArray()){
            int count=0;
            for(char ch:str.toCharArray()){

                if(each==ch){
                    count++;

            }

            }if(count==1){
                result+=each;
            }

        }
        System.out.println(result);
















    }
}
