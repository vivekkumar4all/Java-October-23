package Array;

// public class EvenOdd {

//     static void checkForEvenAndOdd(int num) {
//         if (num % 2 == 0) {
//             System.out.println(num + " is Even");
//         } else {
//             System.out.println(num + " is Odd");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 5, 4, 12, 19, 22, 47, 55, 88 };

//         for (int i = 0; i < arr.length; i++) {
//             // checkForEvenAndOdd(arr[i]);
//             if (arr[i] % 2 == 0) {
//                 System.out.println(arr[i] + " is Even");
//             } else {
//                 System.out.println(arr[i] + " is Odd");
//             }
//         }
//     }
// }

import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {
        final ArrayList<Integer> evenList = new ArrayList<>();
        final ArrayList<Integer> oddList = new ArrayList<>();
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                int evenElement = arr[i];
                evenList.add(evenElement);
            } else {
                int oddElement = arr[i];
                oddList.add(oddElement);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);

    }
}
