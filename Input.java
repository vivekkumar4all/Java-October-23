public class Input {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter your Name");

        // .read() gives me the ASCII code of the first character and rest of the data
        // is lost.
        // int inputValue = System.in.read();

        // readAllBytes() never stops taking input
        byte [] inputValue = System.in.readAllBytes();

        System.out.println("This is the name :" + inputValue);
    }
}
