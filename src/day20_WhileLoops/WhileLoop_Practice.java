package day20_WhileLoops;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        int i=1;
        while(i<=10){

            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        int num=10;
        while (num<15){
            System.out.print("CYbertek"+ " ");
           num++;
        }

        System.out.println(num);

        System.out.println("======================");

        String str ="Cybertek";

        String result="";

        int index =str.length()-1;
        while(index>=0){

            result+=str.charAt(index);

            index--;
        }


        System.out.println(result);








    }
}
