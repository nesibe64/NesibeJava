package day33_LocalDateTime;

public class t2 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,4,21,4,6,8,97};

        for(int element:arr){
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
        System.out.println("========================");
        int [] arr2={4,3,453,2,2,34,5,6,75,4,6};
        unique(arr2);

        System.out.println();
        System.out.println("========================");
        double[] n1={5.4,6.7,8.7,5.4};
        unique(n1);

        System.out.println();
        System.out.println("=========================");
        char[] n2={'a','d','z','a'};
        unique(n2);

    }

    public static void  unique(int[] arr){
        for(int element:arr){
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

    public static void  unique(double[] arr){
        for( double element : arr){
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

    public static void  unique(char[] arr){
        for( char element : arr){
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

}
