package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++);


        int c =25;
        int d=c++;
        System.out.println(c);
        System.out.println(d);

        int x1 = 2;
        System.out.println(x1++);
        int x= 8;
        int y=x--;
        System.out.println(y);
        System.out.println(x);
        System.out.println("========");

        int z=12;
        int e=45;
        int r=56;
        System.out.println(z++);
        System.out.println(e++);
        System.out.println(z--);
        System.out.println(++r);
        System.out.println(--e);


        int t = 50; //t=50
        t= --t+ t++ + t-- + t++;
        // 49+ 49+50+49
        //197
        System.out.println(t);
        System.out.println("============");

        int p=4;
        int o=p*4-p++;
        //o=4*4-4
        //16-4
        //12
        System.out.println(o);








    }












}











