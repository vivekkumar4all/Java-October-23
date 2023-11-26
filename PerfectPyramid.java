public class PerfectPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = 0; space < (5 - i); space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * i) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
