package arraycode;

public class FindLargeElement {
    public static void main(String[] args) {

        int arr[] = {1,5,8,9,3,};

        int num=0;
        for (int num1:arr){
            if(num1>num){
                num=num1;
            }
        }
        System.out.println(num);
    }
}
