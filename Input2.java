import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("This is your name :" + name);
        sc.close();
    }
}
