package day29_CustomMethods;

public class methodsWithoutParameter2 {
    public static void main(String[] args) {
        printHello();
        System.out.println("Cybertek");
        printHello();
        System.out.println("Nesibe");
        printHello();
    }

    public static void printHello(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
        }
    }
}
