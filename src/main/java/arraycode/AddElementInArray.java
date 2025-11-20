package arraycode;

import java.util.ArrayList;

public class AddElementInArray {

    public static void main(String[]args){

        int arr[] = {2,3,4,5,7,8,9};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int num:arr){
            list.add(num);
        }

        addeleAtStart(list,1);
        addeleAtEnd(list,10);
        addeleAtMid(list,6);

        System.out.print(list);
    }

    public static void addeleAtStart(ArrayList<Integer>list,int val){
        list.add(0,val);
    }

    public static void addeleAtEnd(ArrayList<Integer>list,int val){
        list.add(val);
    }
    public static void addeleAtMid(ArrayList<Integer>list,int val){
        list.add(5,val);
    }
}
