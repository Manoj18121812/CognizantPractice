package arraycode;

public class SmallElementArray {

    public static void main(String[] args) {

        int arr[]= {1,5,6,7,8,9,5};

        int num=arr[0];

        for(int i=0;i<arr.length;i++){
            if( arr[i]<num){
                num=arr[i];
            }
        }
        System.out.println(num);
    }
}
