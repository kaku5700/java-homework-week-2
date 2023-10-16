public class Programme_4 {
    String name = "Jaynika"; // Instance variable
    String surname = "Patel"; // Instance Variable
    static int age = 40; // Static variable
    static int rollNumber = 10; // Static variable

    public static void m1() { // Static method
        Programme_4 obj1 = new Programme_4(); // Object creation
        System.out.println("My name is " + obj1.name + " " + obj1.surname);
        System.out.println("My age is: " + age + " & my Roll number is: " + rollNumber);
    }

    public void m2() { // Instance method
        System.out.println("My age is: " + age + " & my Roll number is: " + rollNumber);
        System.out.println("My name is " + name + " " + surname);
    }

    public static void main(String[] args) { // Main method
        Programme_4 obj = new Programme_4(); // Object creation
        m1(); // Static method call
        obj.m2(); // Instance method call
    }
}
