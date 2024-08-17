public class staticMethodDemo {
    public static void main(String[] args) {
        System.out.println("Inside Main method");
        staticMethodDemo.method1();
    }

    //static Methods

    static void method1() {
        System.out.println("Inside static method");
    }

    //static block
    static {
        System.out.println("inside static block");
        staticMethodDemo.method1();
    }

}
