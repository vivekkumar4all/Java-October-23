import java.util.Scanner;

public class Insurance {

    static void calculatePremium(String gender, int age, String city) {
        if (age >= 25 && age <= 35 && gender.equals("male") && city.equals("metro")) {
            System.out.println("Premium is 6%");
        } else if (age >= 25 && age <= 40 && gender.equals("male") && city.equals("non-metro")) {
            System.out.println("Premium is 4%");
        } else if (age >= 25 && age <= 42 && gender.equals("female") && city.equals("metro")) {
            System.out.println("Premium is 3%");
        } else if (age >= 25 && age <= 45 && gender.equals("female") && city.equals("non-metro")) {
            System.out.println("Premium is 2%");
        } else {
            System.out.println("Not Insured");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Person");
        String name = sc.nextLine();
        System.out.println("Enter the Gender of person");
        String gender = sc.nextLine();
        System.out.println("Enter the City of Person");
        String city = sc.nextLine();
        System.out.println("Enter the Age of Person");
        int age = sc.nextInt();

        calculatePremium(gender, age, city);
        sc.close();

    }
}