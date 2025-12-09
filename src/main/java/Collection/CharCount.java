package Collection;

import java.util.HashMap;

public class CharCount {

    public static void main(String[] args) {

        String manoj="manojisking";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:manoj.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);
    }
}
