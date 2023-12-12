public class Temp {

    static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    static int add2(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        add(1, 2);
        int res = add2(1, 2);

        if (res > 5) {
            System.out.println("YAY!!");
        } else {
            System.out.println("MEH!!!");
        }
    }
}
