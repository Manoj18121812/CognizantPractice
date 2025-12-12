package Collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {

        int arr[] = {1,2,1,3,4,5,4,5,6,7,8,9};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num:arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
