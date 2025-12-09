package String;

public class PalindromeCheck {

    public static void main(String[] args){

        String s1 = "nayan";

        /*String reversed = new StringBuilder(s1).reverse().toString();

        if(s1.equals(reversed)){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }*/

        String s2="";

        for(int i=s1.length()-1;i>=0;i--){
            s2 = s2 + s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }
}
