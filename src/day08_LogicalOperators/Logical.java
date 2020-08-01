package day08_LogicalOperators;

import org.w3c.dom.ls.LSOutput;

public class Logical {
    // !: opposite boolean

    public static void main(String[] args) {
        boolean r1 = 9>7;
        boolean r2 = !r1;
        System.out.println(r1 +"  :  "+ r2);

        System.out.println(!false);
        System.out.println(!true);

        boolean r3 = !false==true;
        System.out.println(r3);

        boolean r4 = 9>5 && 9>10;
        System.out.println(r4);











    }












}
