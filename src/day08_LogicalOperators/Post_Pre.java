package day08_LogicalOperators;

public class Post_Pre {
    public static void main(String[] args) {
        int a= 200;
        int b=-a++ + - --a* a-- %2;
         // b = -200 + -200*200%2
        // b = -200+-40000%2
        // b= -200+0
        //b= -200
        System.out.println(b);



        int x = 300;
        int y= 400;
        int z = x+y-x*y+x/y;
                //z=300+400-300*400+300/400
                //z=300+400-120000+300/400
                //z=  700-120000+0
                   //  -119300
        System.out.println(z);







    }









}
