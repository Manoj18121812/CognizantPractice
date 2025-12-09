package String;

public class CounttingVowelsAndConsonents {
    public static void main(String[] args) {
        String manoj = "Manoj Is King";
        String rahul = manoj.toLowerCase();

        int vowels=0;
        int consonents=0;

        for(int i=0;i<rahul.length();i++){

            char ch=rahul.charAt(i);
            if(ch>='a' && ch<='z'){
            if(ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
            consonents++;
            }
        }
        }
        System.out.println(vowels);
        System.out.println(consonents);
    }
}
