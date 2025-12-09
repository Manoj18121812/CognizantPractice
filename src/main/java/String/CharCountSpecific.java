package String;

public class CharCountSpecific {

    public static void main(String[] args) {

        String manoj = "Manoj is King NO";

        manoj= manoj.toLowerCase();
        char target ='n';
        int count=0;

        for(char ch : manoj.toCharArray()){
            if(ch==target){
                count++;
            }

        }
        System.out.println("Count of char is "+target+"="+count);
    }
}
