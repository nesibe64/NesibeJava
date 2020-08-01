package day19_ForLoop;

public class ContinueStatements {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){

            if(i==3){
                continue; //jumps to the next iteration WE ONLY USE IN THE LOOP
            }

            System.out.print(i+" ");

        }
        System.out.println("========================================");

        for(char ch='A';ch<='F';ch++){

            if(ch =='C' || ch=='F'){
                break;
            }
            System.out.print(ch+" ");

        }








    }
}
