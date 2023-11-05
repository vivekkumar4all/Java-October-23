import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner abcd = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = abcd.next(); //String
        System.out.println("Enter your age");
        int age =  abcd.nextInt(); // int
        // float age2 = abcd.nextFloat(); // float
        System.out.println("This is your name :" + name);
        System.out.println("This is your age :" + age);
        abcd.close();
    }
}

