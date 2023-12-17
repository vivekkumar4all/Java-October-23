package Recursion;

public class FindPrime {

    static void isPrime(int num, int divisor) {
        if (num <= 1) {
            System.out.println(num + " The number is not Prime");
            return;
        } else if (num % divisor == 0) {
            System.out.println(num + " The no is not Prime");
            return;
        } else if (divisor > num / 2) {
            System.out.println(num + " The number is Prime ");
            return;
        }
        isPrime(num, divisor + 1);
    }

    static void findInRange(int count) {
        if (count == 0) {
            return;
        }
        isPrime(count, 2);
        findInRange(count - 1);
    }

    public static void main(String[] args) {
        // isPrime(19, 2);
        findInRange(20);
    }
}