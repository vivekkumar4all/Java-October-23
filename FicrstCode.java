// to convert source code into byte code, we have a command 
// javac <SourceCodeFileName.java>

// to convert byte code into machine code we have a command
// java <ByteCodeFileName>

public class FicrstCode {

    // when two or more methods have same name but have different parameters. this
    // is called method overloading

    // this is the main method that JRE knows
    public static void main(String[] args) {

        System.out.print("Hello");
        main(); // user defined main method
    }

    // this is user defined main method
    public static void main() {
        System.out.print("Hi");
    }
}
