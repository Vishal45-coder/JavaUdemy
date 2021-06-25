public class Meth_overload_1 {
    public static void main(String[] args) {

        // Method Overloading: Having same method names but with different parameters
        // There are 3 methods with the name statements but with different parameters
        Statement();
        Statement("vishal");
        int age = Statement(18);
        System.out.println("Age: " + age);
    }

    /**
     * This is the method Statement with no parameters
     */
    public static void Statement() {
        System.out.println("Hello Everyone");

    }

    /**
     * This is the method Statement with parameter and no return type
     * 
     * @param name this one passes the name
     */
    public static void Statement(String name) {
        System.out.println("Name: " + name);

    }

    /**
     * This is the method Staement with parameter and return type
     * 
     * @param age this one passes age as parameter
     * @return It returns age
     */
    public static int Statement(int age) {
        return age;
    }
}
