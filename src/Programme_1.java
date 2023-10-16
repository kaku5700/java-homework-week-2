public class Programme_1 {

    /**
     * Scope - within the class
     * Memory allocation - when object is created
     * memory - heap
     */
    int a = 10;//a is a Instance or Global Variables
    String name = "Jaynika";// name is a Instance or global variable

    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }

    public void myMethod() {
        Programme_1 v1 = new Programme_1();
        System.out.println(v1.a);
        System.out.println(v1.name);
    }
}