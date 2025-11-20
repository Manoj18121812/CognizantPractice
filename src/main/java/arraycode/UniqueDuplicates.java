package arraycode;

import java.util.HashSet;

public class UniqueDuplicates {

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Unique duplicate count : " + duplicates.size());
        System.out.println("Duplicates are : " + duplicates);
    }
}
