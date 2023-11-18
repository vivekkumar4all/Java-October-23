import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();
        System.out.println("Enter 1 for ADD");
        System.out.println("Enter 2 for SUB");
        System.out.println("Enter 3 for MUL");
        System.out.println("Enter 4 for DIV");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("The ADD is" + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("The Subtraction is " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("The MUL is " + (num1 * num2));
        } else if (choice == 4) {
            System.out.println("The DIV is " + (num1 / num2));
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();

    }
}