package day08_LogicalOperators;

public class Practices3 {
    public static void main(String[] args) {
        int b =2;
        boolean res = b++ == 2|| --b ==2 && --b==2;

        System.out.println(res);

        int c = 5;
        boolean r2 = c++ == 6 || c--==5;
        System.out.println(r2);

        int d = 98;
        boolean sonuc= d<34 && true ==!false;
        System.out.println(sonuc);

        boolean x= true ,z = true;
        int y=20;
        x= (y!=10)||(z=false);
        System.out.println(x);


        boolean A=true;
        boolean B=!A;

        boolean C= A!= B && A== !B &&  !A==B;
        System.out.println(C);















    }












}
