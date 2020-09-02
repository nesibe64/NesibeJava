package day41_toString;

public class Carpet {
    /*
    create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitPrice, & isParsian
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        getCarpetInfo(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitPrice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrders(double width,double length,double unitPrice,boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }
    public double calCost(){
        double totalPrice =(width*length)*unitPrice;
        return (isPersian)? totalPrice+200 : totalPrice  ;
    }

    public void getCarpetInfo(){
        System.out.println("=========================================");
        System.out.println("width: "+this.width);
        System.out.println("length: "+this.length);
        System.out.println("Unit price: "+unitPrice);
        System.out.println("Persian Carpet: "+isPersian);
        System.out.println("Total price: "+calCost());
        System.out.println("=========================================");
    }

    public String toString(){
        return "width : "+width+", length: "+length+",Persian: "+isPersian;
    }

}
