package Recursion;

public class Factorial {

    static int fact = 1;

    static void findFact(int num) {
        if (num == 0) {
            return;
        }
        fact = fact * num;
        findFact(num - 1);

    }

    public static void main(String[] args) {
        findFact(5);
        System.out.println("This is the fact :" + fact);
    }
}
