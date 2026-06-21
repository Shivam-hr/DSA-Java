public class hcf {
    static void main() {
        int a = 84;
        int b = 21;
        int reminder;

        int hcf = 0;
        while (b != 0) {
            reminder = a % b;
            a = b;
            b = reminder;
            hcf = a;
        }
        System.out.println(hcf);
    }

}
