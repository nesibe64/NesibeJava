package day43_Static;

public class static_VS_Instance {

    static int staticVariable;  //1 copy
    int instanceVariable;       //2 coppies

    public static void main(String[] args) {

        static_VS_Instance obj1=new static_VS_Instance();
        obj1.instanceVariable =100;
        obj1.staticVariable =500;

        static_VS_Instance obj2=new static_VS_Instance();
        obj2.instanceVariable =200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable); //100
        System.out.println(obj2.instanceVariable);

        System.out.println("======================================");
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        System.out.println(static_VS_Instance.staticVariable); //prefered
        System.out.println(staticVariable);



    }

}
