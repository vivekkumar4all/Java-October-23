import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        int i = 1;
        int fact2 = 1;
        while (i < num) {
            fact2 = fact2 * num;
            num = num - 1;
        }
        System.out.println("This is the result :" + fact);
        System.out.println("This is the result from while loop :" + fact2);

    }
}
