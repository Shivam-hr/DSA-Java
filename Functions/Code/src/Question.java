import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
        for (int i = 100;  i < 1000; i++){
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
            }
        }



    static boolean isAmstrong(int n) {
        int ornignal = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == ornignal;

//    static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        int c = 2;
//
//        while (c * c <=n){
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }
//}
    }
}


