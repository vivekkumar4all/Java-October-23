package Array;

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 8, 4, 3, 9 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to search");
        int search = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Yes, " + search + " exist on index " + i);
                break;
            }
        }
        // System.out.println("No, the value " + search + " does not exist");
    }
}
