package String.Number;

public class SwapNumber {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        System.out.println("before " + a);
        System.out.println("before " + b);
        int temp =a;
        a=b;
        b=temp;

        System.out.println("after "+a);
        System.out.println("after "+b);
    }
}
