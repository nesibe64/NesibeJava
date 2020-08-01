package tasks;

import java.util.Scanner;
                            //FOR LOOPS 1
public class t5 {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();

      if(end >= 0){
          for(int i=0;i<=end-1;i++){
              System.out.print(i+1+" ");
          }
      }else{
          System.out.println();
      }










    }
}
