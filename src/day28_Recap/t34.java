package day28_Recap;

public class t34 {
    public static void main(String[] args) {
        String[] s={"abc","def","abc","klm"};
        String word="abk";

        int count=0;

        for(String each:s){
            if(word.equals(each)){
                count++;
            }
        }
        System.out.println(count);







    }
}
