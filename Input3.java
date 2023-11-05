import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("This is your age :" + age);
        sc.nextLine();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("This is the name :" + name);
        
    }
}
