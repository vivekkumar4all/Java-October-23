import java.util.Scanner;

public class SimpleInterest {

    static void calculateSimpleInterest(int p, float r, int t) {
        float interest = (p * r * t) / 100;
        System.out.println("The simple interst is : (VOID)" + interest);
    }

    static float calculateSimpleInterest2(int p, float r, int t) {
        float interest = (p * r * t) / 100;
        return interest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        int principal = scanner.nextInt();
        System.out.println("Enter the Rate of Interest");
        float rateOfInterest = scanner.nextFloat();
        System.out.println("Enter the Time duration");
        int time = scanner.nextInt();

        // this is the void function
        calculateSimpleInterest(principal, rateOfInterest, time);

        float res = calculateSimpleInterest2(principal, rateOfInterest, time);

        System.out.println("The simple interst is : (return type)" + res);

    }
}
