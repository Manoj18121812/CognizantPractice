package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountFrequency {
    public static void main(String[] args) {

        int arr[]= {1,1,2,3,4,5,5,6,7,8,9,2,3};

        HashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
            System.out.print(key + "="+map.get(key)+" ");
        }
    }
}
