package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char[] ch1={'A','B'};
        char[] ch2={'C','D','F'};
        char[] ch3={'G','E'};

        char[][] ch2D={{'A','B'},{'C','D','F'},{'G','E'}};
                      //  0           1            2

        for(int i=0;i<=ch2D.length-1;i++){
            System.out.println(Arrays.toString(ch2D[i]));
        }
        System.out.println("===========================================");
        System.out.println(ch2D[1][1]);
        //G B
        System.out.println(ch2D[2][0]+" "+ch2D[0][1]);

        System.out.println("==============================================");

        int[][] num ={{1,2,3},{4},{5,6},{7,8,9,10}};
                     //  0     1    2      3

        for(int i=0;i<=num.length-1;i++){

            System.out.println(Arrays.toString(num[i]));
        }

        System.out.println(Arrays.deepToString(num));






















    }
}
