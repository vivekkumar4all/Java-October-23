public class Conditional {
    public static void main(String[] args) {
        // int age = 22;

        // if(age >= 18){
        // System.out.println("Yes you can vote");
        // }
        // else{
        // System.out.println("No, you cannot vote");
        // }

        int a = 5;
        int b = 80;
        int c = 9;
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c && b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}
