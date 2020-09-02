package day43_Static;

public class Variables {

    int b;

    static int s;


    public void method2(){
        System.out.println(b);
        System.out.println(s);
    }


    public static void main(String[] args) {
        //System.out.println(a);

        Variables obj = new Variables();
        System.out.println(obj.b);

       // System.out.println(b); //static ONLY accepts static

    }

    public static void method1(){
        int a=10;
        if(true){
            int b=20;
        }

       // System.out.println(b);
        System.out.println(a);
    }
}
