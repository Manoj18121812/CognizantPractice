package arraycode;

public class SwapArrayElement {
    public static void main(String[] args) {

        int arr[]= {11,22,33,44,55};

        int temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
