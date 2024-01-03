package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderELement {
    public static void main(String[] args) {
        ArrayList<Integer> leaderList = new ArrayList<>();
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int length = arr.length;
        int leaderElement = arr[length - 1];
        leaderList.add(leaderElement);
        for (int i = length - 2; i >= 0; i--) {
            if (arr[i] > leaderElement) {
                leaderElement = arr[i];
                leaderList.add(leaderElement);
            }
        }
        System.out.println(leaderList);
        Collections.reverse(leaderList);
        System.out.println(leaderList);
    }
}
