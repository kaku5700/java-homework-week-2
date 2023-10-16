public class Programme_19 {
    public static void main(String[] args) {
        Programme_19 obj = new Programme_19();
        obj.lower();
    }

    // Instance method converting pre-defined string into Lowercase
    public void lower() {
        String FOX = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String fox = FOX.toLowerCase();
        System.out.println(FOX);
        System.out.println("Converted to Lowercase:");
        System.out.println(fox);
    }

}
