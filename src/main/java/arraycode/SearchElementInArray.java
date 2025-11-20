package arraycode;

public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[]= {1,5,2,6,4,7,8,9};

        int key =3;

        boolean found = false;
        for(int num:arr){
        if(num==key){
            found = true;
            break;
        }

        }
        System.out.println(found ? "Found":"Not Found");

    }
}
