import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();
        System.out.println("Enter + for ADD");
        System.out.println("Enter - for SUB");
        System.out.println("Enter * for MUL");
        System.out.println("Enter / for DIV");
        char choice = scanner.next().charAt(0);

        if (choice == '+') {
            System.out.println("The ADD is" + (num1 + num2));
        } else if (choice == '-') {
            System.out.println("The Subtraction is " + (num1 - num2));
        } else if (choice == '*') {
            System.out.println("The MUL is " + (num1 * num2));
        } else if (choice == '/') {
            System.out.println("The DIV is " + (num1 / num2));
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();

    }
}