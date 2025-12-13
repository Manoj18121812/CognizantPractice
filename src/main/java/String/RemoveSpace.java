package String;

public class RemoveSpace {
    public static void main(String[] args) {

        String str = "Manoj  IS king   ";

        StringBuilder sb = new StringBuilder();

        for(char ch :str.toCharArray()){
            if(ch!= ' '){
                sb.append(ch);
            }


        }
        System.out.println(sb.toString());
    }
}
