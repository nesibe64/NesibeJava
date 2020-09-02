package day24_Arrays;

public class t4 {
    public static void main(String[] args) {

        String[] word={"Ali","Veli","SElami","Ali","Hakki","Aliye","Hakki"};
        String result=" ";
        for(String each:word){
             int count=0;
            for(String each2:word){
                if(each2.equals(each)){
                    count++;
            }
            }
           if(count == 1){
              result += each+" ";
           }
        }
        System.out.println(result + "  ");

    }
}
