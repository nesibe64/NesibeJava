package day28_Recap;

import java.util.Arrays;

public class MultiDArrayPractice2 {
    public static void main(String[] args) {
        int[][] arr2D={{1,2,3},{4,5}};
        int[][][] arr3D={{{1,2,3}, {4,5}},{{6,7,8},{9,10}}};
         //                      0             1

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.toString(arr3D[0][1]));

        System.out.println("=================================");

        for(int i=0;i<= arr3D.length-1;i++){
            int[][] each2D =arr3D[i];
            for(int j=0;j<= each2D.length-1;j++){
                int[] each1D=each2D[j];
                for(int k=0;k<= each1D.length-1;k++){
                    System.out.print(each1D[k]+" ");
                }
                System.out.println();
            }
        }

        System.out.println("==================================");

        for(int[][] each2D:arr3D){
            for(int[] each1D:each2D ){
                for(int each:each1D){
                    System.out.print(each+" ");
                }
                System.out.println();
            }
        }
















    }
}
