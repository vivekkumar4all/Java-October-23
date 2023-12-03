import java.util.Scanner;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || input.charAt(i) == 'e' || input.charAt(i) == 'E'
                    || input.charAt(i) == 'i' || input.charAt(i) == 'I' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'O' || input.charAt(i) == 'u' || input.charAt(i) == 'U') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("The vowel count is " + vowelCount + " and consonant count is " + consonantCount);
        scanner.close();
    }

}
