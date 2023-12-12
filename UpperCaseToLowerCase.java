import java.util.Scanner;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char singleChar = input.charAt(i);
            if (Character.isUpperCase(singleChar)) {
                temp = temp + "" + Character.toLowerCase(input.charAt(i));
            } else {
                temp = temp + "" + Character.toUpperCase(input.charAt(i));
            }
        }
        System.out.println("This is the new string :" + temp);
    }
}
