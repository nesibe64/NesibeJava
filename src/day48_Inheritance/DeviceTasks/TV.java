package day48_Inheritance.DeviceTasks;
/*
 2. create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory
                    methods: watch, setInfo, toString
                    add a constructor that can set the fields

 */
public class TV extends Device{
    /*
    Inherited:
    variables:brand, model, price, MadeIn, hasBattery, hasMemory
    methods:setInfo,toString

    ===============

    Not inherited:
    Variables:remoteControl
    methods:watch
      */

    public  boolean hasRemoteControl;

    public TV(String brand,String model,double price,boolean hasBattery,boolean hasMemory,String screenSize,boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory,screenSize);
        this.hasRemoteControl=hasRemoteControl;
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }



}
