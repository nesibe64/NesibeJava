package day10_IfStatements;

public class Character_Identifiy {
    public static void main(String[] args) {
        char character1 = 'a';

        boolean isAlphabetic = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        //                 upper case letters           || lower case letters
        //48<=CHARACTER <=57
        System.out.println(isAlphabetic);
        boolean isDigit = character1 >= 48 && character1 <= 57;
        boolean specialChar = isAlphabetic == false && isDigit == false;
        String alphabet = "";
        System.out.println(alphabet);



    }
}