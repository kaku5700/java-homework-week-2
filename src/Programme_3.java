public class Programme_3 {
    /**
     * Instance variables
     * Scope - within the class
     * Memory allocation - when object is created
     * memory - heap
     */
    /**
     * Inside the class, outside method with static keyword
     * static variable - class
     * Scope - within the class
     * Memory Allocation - when class is loaded
     * store - non heap memory
     */
    int a = 10;//Instance variable
    static String name = "Jaynika";//Static variable

    public void myMethod() { //Instance method
        Programme_3 v1 = new Programme_3(); //Object creation
        System.out.println(v1.a);
        System.out.println(v1.name);
    }

    public static void m1() { //Static method
        System.out.println(name);
        Programme_3 v2 = new Programme_3();
        System.out.println(v2.a);
    }

    public static void main(String[] args) { // Main method
        Programme_3 v3 = new Programme_3(); // Object creation
        v3.myMethod();
        m1();
    }
}
