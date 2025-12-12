package arraycode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {10,20,10,20,30,40,5,6,4};

        Set<Integer> set = new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
