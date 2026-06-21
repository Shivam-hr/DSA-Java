import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("How many terms? ");
        int n = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for (int i = 3; i<=n; i++) {
            int c  = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }

         */

        // N number

        Scanner in = new Scanner(System.in);
        System.out.println("Plese enter a number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

        while (count <= n) {
            int temp = b;
            b = b +a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

}
