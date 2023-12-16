package Recursion;

import java.util.Scanner;

public class CountDigits {

    static int length = 0;

    static void countDigits(int num) {
        if (num == 0) {
            return;
        }
        length++;
        countDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        countDigits(number);
        System.out.println("This is the length :" + length);
    }
}
