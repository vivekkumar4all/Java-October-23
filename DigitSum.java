package Recursion;

import java.util.Scanner;

public class DigitSum {

    // static int sum = 0;

    static int printSum(int n, int sum) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        sum = sum + lastDigit;
        // n = n / 10;
        // printSum(n);
        printSum(n / 10, sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int res = printSum(number, 0);
        System.out.println("This is the Sum :" + res);
    }
}
