package String;

public class ReverseString {

    public static void main(String[] args){

        String manoj = "manoj";

        /*for(int i=manoj.length()-1;i>=0;i--){
            System.out.print(manoj.charAt(i));
        }*/

        String reverse = new StringBuilder(manoj).reverse().toString();
        System.out.print(reverse);
    }
}
