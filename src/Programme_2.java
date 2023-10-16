public class Programme_2 {
    /**
     * Inside the class, outside method with static keyword
     * static variable - class
     * Scope - within the class
     * Memory Allocation - when class is loaded
     * store - non heap memory
     */
    static int a = 10;
    static String name = "Jaynika";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(name);
    }

    public static void m1() {
        System.out.println(a);
        System.out.println(name);
    }
}

