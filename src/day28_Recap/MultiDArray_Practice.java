package day28_Recap;

public class MultiDArray_Practice {
    public static void main(String[] args) {
        String[] arr1={"elma","armut","kel","mahmut"};
        String[] arr2={"Virginia","Hkki","Bulnet","Asiye"};
        String[] arr3={"aaa","bbbb","ccc","eeee"};

        String[][] batch={arr1,arr2,arr3};

        for(String[] arr1D:batch){
            for(String eachElement:arr1D){
                if(eachElement.toLowerCase().contains("a"))
                System.out.println(eachElement);
            }
            System.out.println();
        }














    }
}
