import java.util.Scanner;

public class CalculatorFuntion {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter 1 for add, 2 for sub, 3 for mul and 4 for div");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int res = add(num1, num2);
            System.out.println(res);
        } else if (choice == 2) {
            int res = sub(num1, num2);
            System.out.println(res);
        } else if (choice == 3) {
            int res = mul(num1, num2);
            System.out.println(res);
        } else if (choice == 4) {
            int res = div(num1, num2);
            System.out.println(res);
        }
        scanner.close();
    }
}
