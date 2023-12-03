import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int numCopy = num;
        int numCopy2 = num;
        int length = 0;
        int sum = 0;
        while (num != 0) {
            num = num / 10;
            length++;
        }

        while (numCopy != 0) {
            int singleDigit = numCopy % 10;
            int powerValue = (int) Math.pow(singleDigit, length);
            sum = sum + powerValue;
            numCopy = numCopy / 10;
        }

        if (sum == numCopy2) {
            System.out.println("Yes the number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
        scanner.close();
    }
}
