import java.util.Scanner;

public class Calc2 {

    static int add(int a, int b) {
        int c = 0;
        return a + b;
    }

    static int sub(int a, int b) {
        int c = 50;
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
        // char choice = scanner.next().charAt(0);

        int choice = scanner.nextInt();

        int res = 0;
        switch (choice) {
            case 1:
                res = add(num1, num2);
                System.out.println(res);
                break;
            case 2:
                res = sub(num1, num2);
                System.out.println(res);
                break;
            case 3:
                res = mul(num1, num2);
                System.out.println(res);
                break;

            case 4:
                res = div(num1, num2);
                System.out.println(res);
                break;
        }

        scanner.close();
    }
}
