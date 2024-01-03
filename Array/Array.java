package Array;

public class Array {

    static void updateMarks(int arr[], int index, int newValue) {
        arr[index] = newValue;
    }

    static void delete(int arr[], int index){
        for(int i = index; i < arr.length; i ++){
            arr[i] = arr[i +1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("These are the marks :" + marks[i]);
        }
    }
}
