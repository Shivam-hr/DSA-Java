public class Swaaping {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);
    swap(10,20);
    }

    static void swap(int a, int b ) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);

        // this change is just valid in this fnx scope only
    }
}
