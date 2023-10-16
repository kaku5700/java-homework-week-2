import java.util.Scanner;

public class Programme_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for user input
        System.out.println("Hello! Please input first number and press enter: ");
        int a = scanner.nextInt(); // saving first user input
        System.out.println("Awesome! Now please input second number and press enter: ");
        int b = scanner.nextInt(); // saving second user input
        addition(a, b); // addition static method call
        subtraction(a, b); // subtraction static method call
        Programme_5 obj = new Programme_5(); // object creation
        obj.division(a, b); // instance method call through object
        obj.multiplication(a, b); // instance method call through object
        scanner.close();// closing scanner
    }

    //Static method
    public static void addition(int a, int b) {
        int add = a + b;
        System.out.println("The addition of the two numbers is: " + add);
    }

    // Static method
    public static void subtraction(int a, int b) {
        int sub = a - b;
        System.out.println("The subtraction of the two numbers is: " + sub);
    }

    // Instance method
    public void division(int a, int b) {
        int div = a / b;
        System.out.println("The division of the two numbers is: " + div);
    }

    // Instance method
    public void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println("The multiplication of the two numbers is: " + mul);
    }

}
