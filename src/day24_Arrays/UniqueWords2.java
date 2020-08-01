package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
        String words[]={"ali","ayse","fatma","ali","ebe","zekiye"};


        for(String each :words){
            int count = 0;
            for(String b : words){
                if(each.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(each+" ");
            }
        }



















    }
}
