import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a =  input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println("The sum is: " + sum);

    }
}
