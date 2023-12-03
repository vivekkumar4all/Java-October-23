import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int numCopy =  number;
        int num2 = 0;
        while (number > 0) {
            int remainder = number % 10;
            num2 = (num2 * 10) + remainder;
            number = number / 10;
        }
        if (numCopy == num2) {
            System.out.println("The number is a palindrome number");
        } else {
            System.out.println("The number is not palindrome");
        }

        sc.close();
    }

}
