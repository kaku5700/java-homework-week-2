import java.util.Scanner;

public class Programme_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Scanner object for user input
        System.out.println("Please Enter the Radius Value : ");//saving user input
        double a = Double.parseDouble(scan.next());
        radius(a);//static method call
        scan.close();// closing scanner
    }

    // Static method calculating radius of inserted number
    public static void radius(double a) {
        double b = (3.14 * a * a);
        System.out.println("The Area of entered radius = " + b);
    }
}
