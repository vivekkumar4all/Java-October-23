import java.util.Scanner;

public class GreatestAmongThreeScanner {
    public static void main(String[] args) {
        Scanner abcd = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = abcd.nextInt();
        System.out.println("Enter the second number");
        int num2 = abcd.nextInt();
        System.out.println("Enter the third number");
        int num3 = abcd.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }
        abcd.close();
    }
}
