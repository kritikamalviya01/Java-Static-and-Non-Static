public class objectReferenceDemo {
    int num;

    objectReferenceDemo(){

    }
    //Object Reference in Static block
    static {
        objectReferenceDemo obj = new objectReferenceDemo();
        System.out.println(obj.num);
//        System.out.println(obj);
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        // Object Reference
        objectReferenceDemo obd = new objectReferenceDemo();
        System.out.println(obd.num);
    }
}
