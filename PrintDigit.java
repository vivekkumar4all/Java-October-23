package Recursion;

public class PrintDigit {

    static void printDigit(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        printDigit(n - 1);
    }

    public static void main(String[] args) {
        printDigit(10);
    }
}
