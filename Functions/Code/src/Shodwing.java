public class Shodwing {

   static int x = 90;// anything we use  inside the main fxn we need to made  it static
    public static void main(String[] args) {

        System.out.println(x);
        int x = 40; // class variable at line 3 is shadowded by this
        System.out.println(x);


    }
}
