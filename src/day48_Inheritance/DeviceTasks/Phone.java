package day48_Inheritance.DeviceTasks;

/*
        3. create a sub class of device called phone:
                    attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory,hASSIMCARD,OPERating system
                    methods: call, text, setInfo, toString
                    add a constructor that can set the fileds

 */

public class Phone extends Device {

    public static boolean hasSimCard =true;
    public String OS;

    public Phone(String brand,String model,double price,boolean hasBattery,boolean hasMemory,String screenSize,boolean hasSimCard,String OS){ }

    public void call(long phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting: "+phoneNumber);
    }

}
