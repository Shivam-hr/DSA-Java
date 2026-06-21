import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n = 152643252;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 2) {
                count++;
            }
            n = n / 10;
        }
            System.out.println(count);
    }
}