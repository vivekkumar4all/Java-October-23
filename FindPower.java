package Recursion;

public class FindPower {

    static int powerValue = 1;

    static void findPower(int baseNumber, int exponent) {
        if (exponent == 0) {
            return;
        }
        powerValue = powerValue * baseNumber;
        findPower(baseNumber, exponent - 1);
    }

    public static void main(String[] args) {
        findPower(5, 3);
    }
}
