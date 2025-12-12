package String;

public class PrintEvenOddindex {

    public static void main(String[] args) {

        String manoj[]= {"manoj","rahul","reshma","sachin","vaishnavi"};

        for(int i=0;i<manoj.length;i=i+2){
            System.out.println(manoj[i]);
        }

        for(int i=1;i<manoj.length;i=i+2){
            System.out.println(manoj[i]);
        }
    }

}
