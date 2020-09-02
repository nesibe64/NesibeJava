package day24_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class t5 {
    public static void main(String[] args) {
        String str="Hakki,Veli,ASiye,ASiye,Veli,EDa";
        String result="";
        String[] a=str.split(",");
        System.out.println(Arrays.toString(a));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(a));
        for (String each:list) {
            if(Collections.frequency(list,each)==1){
             result+=each+" ";
            }
        }
        System.out.println(result);
        /*for(String each: a){

            int count=0;
            for(String each1:a){

                if(each.equals(each1)){
                  count++;
                }
            }
            if(count==1){
                result +=each+" ";
            }
        }
        System.out.println(result);*/
    }
}
