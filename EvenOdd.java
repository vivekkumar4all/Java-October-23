package Recursion;

import java.util.Scanner;

public class EvenOdd {

    static void printEvenOdd(int n) {
        if (n == 0) {
            return;
        }
        printEvenOdd(n - 1);
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        printEvenOdd(num);
        scanner.close();
    }
}
