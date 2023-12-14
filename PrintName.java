package Recursion;

import java.util.Scanner;

public class PrintName {

    static void printName(int n, String name) {
        // this is the base case
        if (n == 0) {
            return;
        }
        // this is the logic
        System.out.println(name);
        // this is the small problem
        printName(n - 1, name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        printName(5, name);
    }
}
