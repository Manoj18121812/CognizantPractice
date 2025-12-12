package String;

public class StringUppercaseToLowercse {

    public static void main(String[] args) {
        String manoj = "MaNoJ";
        StringBuilder sb = new StringBuilder();

        for(char ch:manoj.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

}
