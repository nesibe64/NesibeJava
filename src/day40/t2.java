package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class t2 {

    public static void main(String[] args) {
        t1 person1=new t1();
        t1 person2=new t1();
        t1 person3=new t1();


        person1.sett1Info(105000,"FL",true,true,true,"SDET",true);
        person2.sett1Info(120000,"VA",false,false,false,"QA",true);
        person3.sett1Info(130000,"CA",true,false,true,"QA",true);

        ArrayList<t1> jobOffer=new ArrayList<>();
        jobOffer.addAll(Arrays.asList(person1,person2,person3));

        for(t1 each:jobOffer){
            each.gett1Info();
        }
        System.out.println("=========================================================");

        jobOffer.removeIf(p->p.salary<120000|| !p.state.equals("FL"));
        System.out.println("Numbers of Offers: "+jobOffer.size());



    }
}
