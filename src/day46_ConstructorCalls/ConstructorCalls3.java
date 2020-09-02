package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3(){

    }
    public ConstructorCalls3(int a){
        System.out.println("Y");
    }

    public ConstructorCalls3(double a){
        this();

    }

    public void method1(){
        //ConstructorCalls3();  //cannot be called by name

    }


}
