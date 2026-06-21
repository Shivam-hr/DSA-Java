import java.util.Scanner;

public class Calculaotr {
    public static void main(String[] args) {
        int ans = 0;

        System.out.print("Enter a operator: ");
        Scanner in = new Scanner(System.in);
        char op = in.next().charAt(0);
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if (op == '/') {
            ans = num1 / num2;
        } else if (op == '%') {
            ans = num1 % num2;
        }

        System.out.println("Answer is " +  ans);



    }
}
