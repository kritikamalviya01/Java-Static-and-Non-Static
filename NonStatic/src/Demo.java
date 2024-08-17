public class Demo {

    static Demo obj;

    static {
        System.out.println(Demo.obj);// Value not assign so this will print null
        Demo.obj = new Demo(); // assigned object value
//        System.out.println(Demo.obj);
    }

    public static void main(String[] args) {
        System.out.println(Demo.obj);
    }
}
