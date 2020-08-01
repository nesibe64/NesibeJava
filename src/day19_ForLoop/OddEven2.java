package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {
        for(int i =0;i<=50;i+=1){
            if(i %2==0){ // odd number
               continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        for(int i =0;i<=50;i++){
            if(i%2!=0){ //even number
                continue;
            }
            System.out.print(i+" ");
        }












    }
}
