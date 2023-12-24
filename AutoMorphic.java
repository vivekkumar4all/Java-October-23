package Recursion;

import java.util.Scanner;

public class AutoMorphic {

    // static int length = 0;

    static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    static int square(int n) {
        return n * n;
    }

    static void isAutoMorphic(int num) {
        int numLenght = countDigits(num);
        int numSq = square(num);
        int divisor = (int) Math.pow(10, numLenght);
        int lastDigits = numSq % divisor;

        if (lastDigits == num) {
            System.out.println("The number is AutoMorphic");
        } else {
            System.out.println("The number is not AutoMorphic");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        isAutoMorphic(number);
        scanner.close();
    }
}
