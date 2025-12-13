package String;

public class ExtractDigitFromString {
    public static void main(String[] args) {

        String manoj= "ma2kam5lao6oak";
        StringBuilder digits = new StringBuilder();

        for(char ch :manoj.toCharArray()){
            if(Character.isDigit(ch)){
                digits.append(ch);
            }
        }

        System.out.println(digits);
    }
}
