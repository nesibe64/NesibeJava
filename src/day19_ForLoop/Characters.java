package day19_ForLoop;

public class Characters {
    public static void main(String[] args) {
        for(char i=65;i<=90;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for(char ch='Z'; ch>='A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();

        for(int i=97;i<=122;i++){
            char ch=(char)i;
            System.out.print(ch+" ");
        }
        System.out.println();

        for(char i =122; i>=97;i--){

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("============================================================================");

        for(char i=0;i<6500;i++){
            System.out.print(i+" ");
        }




















    }
}
