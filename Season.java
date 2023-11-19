import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month:");
        String month = scanner.next();

        // switch (month) {
        // case "Jan":
        // System.out.println("Winter");
        // break;
        // case "Feb":
        // System.out.println("Winter");
        // break;
        // case "Mar":
        // System.out.println("Spring");
        // break;
        // case "Apr":
        // System.out.println("Spring");
        // break;
        // case "May":
        // System.out.println("Summer");
        // break;
        // case "Jun":
        // System.out.println("Summer");
        // break;
        // case "Jul":
        // System.out.println("Rainy");
        // break;
        // case "Aug":
        // System.out.println("Fall");
        // break;
        // case "Sept":
        // System.out.println("Fall");
        // break;
        // case "Oct":
        // System.out.println("Fall");
        // break;
        // case "Nov":
        // System.out.println("Winter");
        // break;
        // case "Dec":
        // System.out.println("Winter");
        // break;

        // default:
        // break;
        // }

        switch (month) {
            case "Jan":
            case "Feb":
            case "Nov":
            case "Dec":
                System.out.println("Winter");
                break;
            case "Mar":
            case "Apr":
                System.out.println("Spring");
                break;
            case "May":
            case "Jun":
                System.out.println("Summer");
                break;
            case "Jul":
                System.out.println("Rainy");
                break;
            case "Aug":
            case "Sept":
            case "Oct":
                System.out.println("Fall");
                break;

            default:
                break;
        }
    }
}
