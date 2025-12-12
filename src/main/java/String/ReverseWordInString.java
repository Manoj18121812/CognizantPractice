package String;

public class ReverseWordInString {
    public static void main(String[] args) {

        String manoj = " My name is manoj";
        String arr[] = manoj.split(" ");

        StringBuilder result = new StringBuilder();
        for(String w:arr){
            StringBuilder sb = new StringBuilder(w);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());

    }
}
