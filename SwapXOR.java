public class SwapXOR {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("Variable before swap " + a + "and" + b);
        // swap using XOR operation

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Variable after swap " + a + "and" + b);

    }
}
