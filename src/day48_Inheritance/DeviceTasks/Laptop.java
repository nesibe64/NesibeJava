package day48_Inheritance.DeviceTasks;
/*
 4. create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory,hasCPU,hasMouse,hasKeyboard,
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds

 */

public class Laptop extends Device{
    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyboard;

    public String OS;
    public Laptop(String brand,String model,double price,boolean hasBattery,boolean hasMemory,String screenSize,String OS,boolean hasCPU,boolean hasKeyboard,boolean hasMouse){}

    public void coding(String language){
        System.out.println("coding "+language+" in "+brand+" "+model);
    }
}
