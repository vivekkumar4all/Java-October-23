public class Functions {

    // here add is the name of the function

    // void - no return type

    // this is the first type of fn no return type and no parameter
    void add() {
        int a = 100;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    // no return type but have parameters
    static void add2(int a, int b) {
        int c = a + b;
    }

    // fn having return type and no parameter
    int add3() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    // fn having return type (int) and also have the parameters
    int add4(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {

        Functions abcd = new Functions();
        // abcd.add();
       int res =  abcd.add3();
       System.out.println(res);
    }
}
