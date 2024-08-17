//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    int num; // Non static variable

    // Constructor
    Main(){
        System.out.println("Inside constructor");
    }

    // Non static Block
    {
        System.out.println("Inside Non static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        new Main();
        new Main();
    }

    // Static Block

    static {
        System.out.println("Inside Static block");
    }
}