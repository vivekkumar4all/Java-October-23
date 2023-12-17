package Recursion;

public class Temp1 {

    static void add(int a, int b) {
        int c = a + b;
        System.out.println("this is the sum :" + c);
    }

    static int add2(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        add(1, 2);
        int result = add2(4, 5);
        System.out.println("this is the second fn :" + result);
    }
}
