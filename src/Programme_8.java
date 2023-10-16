import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// Scanner object for user input
        System.out.println("Enter the Base Value of Triangle : ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the Height Value of Triangle : ");
        double b = Double.parseDouble(scan.nextLine());
        Programme_8 obj = new Programme_8();
        obj.area(a, b);
        scan.close();
    }

    // Instance Method Calculating the Area Of the Triangle
    public void area(double a, double b) {
        double c = ((a * b) / 2);
        System.out.println("The Area of the Triangle is : " + c);
    }
}
