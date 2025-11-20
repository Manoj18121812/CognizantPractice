package arraycode;

public class SumOfArray {
    public static void main(String[] args) {

        int arr[]= {1,2,3,5,6,7,8,9};
        int sum = 0;
        for(int num:arr){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
