package day31_Recap;

public class t1 {
    public static void main(String[] args) {
        String str="aabbc";
        String result="";


        for(int i=0;i<=str.length()-1;i++) {
            char ch = str.charAt(i);
            int count=0;
            for (int j = 0; j <= str.length()-1; j++) {
                char each = str.charAt(j);
                if(ch == each){
                  count++;
                }
            }
            if(count==1){
                result+=ch;

            }

        }
        System.out.println(result+"");

    }
}
