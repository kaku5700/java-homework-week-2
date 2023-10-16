public class Programme_14 {
    static double W = 5.5;
    static double H = 8.5;

    public static void main(String[] args) {
        Programme_14 obj = new Programme_14();
        obj.countarea();
        System.out.println();
        obj.perimeter();
    }

    //instance method calculating the area of given values
    public void countarea() {
        double area = (W + 0.1) * H;
        System.out.printf("Area is " + String.format("%.2f", area));
    }

    //instance method calculating the perimeter of given values
    public void perimeter() {
        double peri = 2 * ((W + 0.1) + H);
        System.out.printf("Perimeter is " + String.format("%.2f", peri));
    }


}
