package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    static int firstTerm = 0;
    static int secondTerm = 1;
    static int nextTerm = 0;
    static void printFibonacci(int count){
        if(count==0){
            return;
        }
        nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        System.out.print(" " + nextTerm);
    printFibonacci(count-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int count = sc.nextInt();
        System.out.print(firstTerm + " " + secondTerm);
        printFibonacci(count-2);
    }
 }
    


