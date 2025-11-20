package arraycode;

import java.util.Arrays;

public class SecondSmallArrayEle {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};

        Arrays.sort(arr);
        System.out.print("Second Smallest = " +arr[1]);
    }
}
