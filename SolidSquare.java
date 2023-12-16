package Recursion;

public class SolidSquare {

    static void printStar(int starCount) {
        if (starCount == 0) {
            return;
        }
        System.out.print("* ");
        printStar(starCount - 1);
    }

    static void pritnPattern(int row, int col) {
        if (row == 0) {
            return;
        }
        printStar(col);
        System.out.println();
        pritnPattern(row - 1, col);
    }

    public static void main(String[] args) {
        pritnPattern(4, 15);
    }
}
