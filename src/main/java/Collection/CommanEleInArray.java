package Collection;

import java.util.HashSet;
import java.util.Set;

public class CommanEleInArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {1,3,4,5,6};

        Set<Integer> set = new HashSet<Integer>();

        for(int num : arr){
            set.add(num);
        }

        for(int num2:arr1){
            if(set.contains(num2)){
                System.out.print(num2 + " ");
            }
        }
    }
}
