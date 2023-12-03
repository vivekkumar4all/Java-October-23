import java.util.Scanner;

public class PrintDigit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int numCopy = number;

        int length = 0;
        while (number != 0) {
            number = number / 10;
            length++;
        }

        int powerr = (int) Math.pow(10, length - 1);

        while (numCopy != 0) {
            int singleDigit = numCopy / powerr;
            System.out.println(singleDigit);
            numCopy = numCopy % powerr;
            powerr = powerr / 10;
        }
    }
}
