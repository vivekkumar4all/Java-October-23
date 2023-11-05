//RiddhimaSharma - PascleCase (class Name)

//riddhimaSharma - camelCase (function/method Name)

// riddhima_sharma - snake_case (file Name)

public class Ref {
    public static void main(String[] args) {
        // String name1 = "Ram"; // name1 has ref of data "Ram"
        // // String name2 = "Ram";
        // String name2 = name1;
        // String name3 = "Ram";
        // System.out.println(name1 == name2);
        // == is used to compare the ref or add of two Strings
        // System.out.println(name2 == name3);

        String name1 = "RAM";
        String name2 = new String("ram");
        // System.out.println(name1 == name2); // ref compare //false
        // System.out.println(name1.equals(name2)); // value compare //falase
        // System.out.println(name1.equalsIgnoreCase(name2)); // value //true

    }
}
