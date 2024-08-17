public class ThisKeywordDemo {
    int x;

    ThisKeywordDemo(int x){
        this.x = x;
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new ThisKeywordDemo(10);
        new ThisKeywordDemo(0);
    }
}
