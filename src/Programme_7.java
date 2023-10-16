import java.util.Scanner;

public class Programme_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Scanner object for user input
        System.out.println("Enter Fahrenheit Temperature Value : ");//saving user input
        double a = Double.parseDouble(scan.nextLine());
        celsius(a);//static method call
        scan.close();//closing scanner
    }

    //static method converting fahrenheit value to celsius
    public static void celsius(double a) {
        double b = ((a - 32) * 5 / 9);
        System.out.println("The celsius Temperature Value is : ");
    }
}
