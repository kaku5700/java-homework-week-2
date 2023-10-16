import java.util.Scanner;

public class Programme_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input any number: ");
        int a = Integer.parseInt(scan.nextLine());
        scan.close();
        Programme_17 obj = new Programme_17();
        obj.binary(a);
    }

    //Instance method converting the inserted value to binary and representing in string
    public void binary(int a) {
        String bin = Integer.toBinaryString(a);
        System.out.println("The Binary value for inserted number is: " + bin);
    }
}
