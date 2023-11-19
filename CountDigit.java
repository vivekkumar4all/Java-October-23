import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        int length = 0;
        while (num != 0) {
            num = num / 10;
            length++;
        }
        System.out.println("The length is :" + length);
    }
}
