import java.util.Scanner;

public class Programme_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any Uppercase Character : ");
        char c = scan.next().charAt(0);
        scan.close();
        low(c);
    }

    // static method storing a character value in string and then converting into the lowercase
    public static void low(char c) {
        String d = "" + c;
        System.out.println("The Lowercase character is : " + d.toLowerCase());
    }
}
