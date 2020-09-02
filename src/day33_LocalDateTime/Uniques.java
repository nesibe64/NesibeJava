package day33_LocalDateTime;

import java.util.Arrays;

public class Uniques {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,3,2,1,34};

        for(int element : arr){
            int count=0;
            for(int b:arr){
                if(element==b){
                    count++;
                }
            }

            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();
        System.out.println("==========================");
        int[] n1={45,56,7,8,9,9,87,7,5,4,3,21,43,45,56};
        uniqueElemets(n1);

        System.out.println();
        char[] n2={'a','f','h','a','k'};
        uniqueElemets(n2);

        System.out.println();
        String[] n3={"Ali","ZEkiye","Ali","Hakan"};
        uniqueElemets(n3);

        System.out.println();
        double[] n4={3.5,5.6,3.4,7.6};
        uniqueElemets(n4);
    }

    public static void uniqueElemets(int[] arr){
        for(int element : arr){
            int count=0;
            for(int b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }
    public static void uniqueElemets(char[] arr){
        for(char element : arr){
            int count=0;
            for(char b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }


    public static void uniqueElemets(String[] arr){
        for(String element : arr){
            int count=0;
            for(String b:arr){
                if(element.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }
    public static void uniqueElemets(double[] arr){
        for(double element : arr){
            int count=0;
            for(double b:arr){
                if(element==b){
                    count++;
                }
            }
            if(count==1){
                System.out.print(element+" ");
            }
        }
    }
}
