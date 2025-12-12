package Number;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[]={1,2,3,5};
        int n= arr.length+1;
        int sum = n*(n+1)/2;

        int miss=0;
        for(int num:arr){
            miss=miss+num;
        }
int missing = sum-miss;
        System.out.println("Missing no is "+missing);
    }
}
